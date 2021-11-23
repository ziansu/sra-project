public void deleteById(vaycent.ormlitesharp.DbObjectClass dbObjClass, int id) {
    try {
        vaycent.ormlitesharp.OrmliteDB ormliteDB = vaycent.ormlitesharp.OrmliteDB.getHelper(context);
        com.j256.ormlite.dao.Dao myDao = ormliteDB.getDao(dbObjClass.getClassData());
        myDao.deleteById(id);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}