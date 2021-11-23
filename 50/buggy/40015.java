@java.lang.Override
public void load(java.lang.String uniqueID) {
    if (conversation.isTransient()) {
        conversation.begin();
        org.imixs.marty.workflow.WorkflowController.logger.fine(("start new conversation, id=" + (conversation.getId())));
    }
    super.load(uniqueID);
}