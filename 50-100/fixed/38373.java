public void insertNotResource(final java.util.List<java.lang.String> listId, final java.lang.String userId, final java.lang.String QueryProperties) {
    java.lang.String INSERT_USERID_X = null;
    for (int i = 0; i < (listId.size()); i++) {
        INSERT_USERID_X = QueryProperties;
        dao.insertObjectNotResource(INSERT_USERID_X, userId, listId.get(i));
    }
}