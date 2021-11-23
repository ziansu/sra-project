@java.lang.Override
public com.tj.sample.model.Person updateEntity(java.lang.Class<?> type, com.tj.producer.RequestContext request, com.tj.producer.ResponseContext response, com.tj.sample.model.Person object, com.tj.producer.KeyMap keys) {
    return dao.updateEntity(object, keys);
}