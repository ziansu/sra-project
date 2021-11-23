public static java.util.List<?> listAll() {
    if ((com.martji.mdbhelper.model.DataA.dao) == null) {
        return null;
    }
    return com.martji.mdbhelper.model.DataA.dao.queryForAll();
}