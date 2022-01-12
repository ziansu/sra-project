public static com.scrum.datapersistence.entity.WorkitemEntity convertToEntity(com.scrum.common.model.workitem.args.WorkitemModel model) {
    com.scrum.datapersistence.entity.WorkitemEntity entity = new com.scrum.datapersistence.entity.WorkitemEntity(model.getWorkitemId(), model.getName(), model.getDescription(), ((model.getStatus()) == null ? null : model.getStatus().name()), model.getWorkitemPayload(), model.getCreatedBy(), model.getCreatedDate(), model.getUpdatedBy(), model.getUpdatedDate(), model.getVersion());
    return entity;
}