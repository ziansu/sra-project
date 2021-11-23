@java.lang.Override
public boolean checkConstraint(org.corpus_tools.salt.core.SGraph.GRAPH_TRAVERSE_TYPE traversalType, java.lang.String traversalId, org.corpus_tools.salt.core.SRelation<org.corpus_tools.salt.core.SNode, org.corpus_tools.salt.core.SNode> relation, org.corpus_tools.salt.core.SNode currNode, long order) {
    if (relation == null) {
        return true;
    }
    if ((relation != null) && (relationClazz != null)) {
        if (relationClazz.isAssignableFrom(relation.getClass())) {
            return true;
        }
    }
    return false;
}