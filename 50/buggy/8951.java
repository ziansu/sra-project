@java.lang.Override
public com.tj.sample.model.Person createEntity(java.lang.Class<?> type, com.tj.producer.RequestContext request, com.tj.producer.ResponseContext response, com.tj.sample.model.Person object) {
    return dao.createEntity(object);
}