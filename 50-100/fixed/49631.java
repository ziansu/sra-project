@java.lang.Override
public void create(javax.faces.event.ActionEvent event) {
    super.create();
    if (conversation.isTransient()) {
        conversation.begin();
        org.imixs.marty.workflow.WorkflowController.logger.fine(("start new conversation, id=" + (conversation.getId())));
    }
    events.fire(new org.imixs.marty.workflow.WorkflowEvent(getWorkitem(), WorkflowEvent.WORKITEM_CREATED));
}