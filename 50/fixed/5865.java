@java.lang.Override
public int update(java.lang.Object entity) {
    properties.setEntityParameter(entity);
    checkPkNotNull();
    return update();
}