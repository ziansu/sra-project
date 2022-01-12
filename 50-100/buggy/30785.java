public com.wm.lock.entity.Communication findNextWrite(java.lang.String userJobNumber, long currId) {
    try {
        final java.util.List<com.wm.lock.entity.Communication> list = where(0, 1, "id_", true).and().eq("source", userJobNumber).and().gt("id_", currId).query();
        if (com.wm.lock.core.utils.CollectionUtils.isEmpty(list)) {
            return null;
        }
        return list.get(0);
    } catch (java.sql.SQLException e) {
        throw new com.wm.lock.exception.DbException(e);
    }
}