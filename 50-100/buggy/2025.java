public void startCopyTrans() {
    identity.checkPermission(projectIteration, "copy-trans");
    if (isInProgress()) {
        return ;
    }else
        if ((getProjectIteration().getDocuments().size()) <= 0) {
            conversationScopeMessages.setMessage(FacesMessage.SEVERITY_INFO, msgs.get("jsf.iteration.CopyTrans.NoDocuments"));
            return ;
        }
    
    org.zanata.model.HCopyTransOptions options = copyTransOptionsModel.getInstance();
    copyTransManager.startCopyTrans(getProjectIteration(), options);
    conversationScopeMessages.setMessage(FacesMessage.SEVERITY_INFO, msgs.get("jsf.iteration.CopyTrans.Started"));
}