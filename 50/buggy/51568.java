@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public com.scrum.common.model.workitem.args.WorkitemModel executeQuery(java.lang.String id) {
    com.scrum.datapersistence.entity.WorkitemEntity item = workItemRepository.findOne(id);
    return com.scrum.persistenceapi.workitem.converters.WorkitemConverter.convertToModel(item);
}