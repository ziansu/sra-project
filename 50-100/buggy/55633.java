public foam.dao.FObject find(java.lang.Object o) {
    java.lang.Object id = ((getOf().getClass().isInstance(o)) || true) ? getPrimaryKey().get(o) : o;
    return getData().get(id);
}