@java.lang.Override
public boolean test(cc.kave.commons.model.events.completionevents.ICompletionEvent event) {
    if ((event.getTerminatedState()) != (cc.kave.commons.model.events.completionevents.TerminationState.Applied)) {
        return false;
    }
    cc.kave.commons.model.events.completionevents.IProposal proposal = event.getLastSelectedProposal();
    if (proposal == null) {
        return false;
    }else
        if (!((proposal.getName()) instanceof cc.kave.commons.model.names.IMethodName)) {
            return false;
        }
    
    return true;
}