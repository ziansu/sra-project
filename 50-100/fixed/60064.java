@java.lang.Override
public boolean hasNext() {
    if (queryIterator.hasNext())
        return true;
    
    if ((atomicQueryIterator.hasNext()) && (!(nextList.isEmpty()))) {
        ai.grakn.graql.admin.Answer feederSub = atomicQueryIterator.next();
        queryIterator = new ai.grakn.graql.internal.reasoner.query.ReasonerQueryImplCumulativeIterator(feederSub.merge(partialSub, true), nextList, subGoals, cache);
        return hasNext();
    }
    return false;
}