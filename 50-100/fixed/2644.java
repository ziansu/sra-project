private void deleteOldICals(com.j256.ormlite.dao.RuntimeExceptionDao<de.fau.cs.mad.fablab.rest.core.ICal, java.lang.Long> iCalDao) {
    com.j256.ormlite.stmt.DeleteBuilder<de.fau.cs.mad.fablab.rest.core.ICal, java.lang.Long> deleteBuilder = iCalDao.deleteBuilder();
    try {
        deleteBuilder.where().lt("end", java.lang.System.currentTimeMillis());
        iCalDao.delete(deleteBuilder.prepare());
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}