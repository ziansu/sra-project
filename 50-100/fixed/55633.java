public foam.dao.FObject find(java.lang.Object o) {
    java.lang.Object id = ((getOf().getClass().isInstance(o)) || false) ? getPrimaryKey().get(o) : o;
    return getData().get(id);
}