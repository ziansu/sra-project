public void addAttachment(com.validation.manager.core.server.core.AttachmentServer attachment) throws java.lang.Exception {
    com.validation.manager.core.db.ExecutionStepHasAttachment esha = new com.validation.manager.core.db.ExecutionStepHasAttachment();
    com.validation.manager.core.db.controller.ExecutionStepHasAttachmentJpaController controller = new com.validation.manager.core.db.controller.ExecutionStepHasAttachmentJpaController(com.validation.manager.core.DataBaseManager.getEntityManagerFactory());
    esha.setAttachment(attachment.getEntity());
    esha.setExecutionStep(getEntity());
    esha.setCreationTime(new java.util.Date());
    controller.create(esha);
    getExecutionStepHasAttachmentList().add(esha);
    write2DB();
    update();
}