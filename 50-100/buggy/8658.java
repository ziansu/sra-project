public void remove(T po) {
    com.easy.player.database.SQLiteHelperOrm db = new com.easy.player.database.SQLiteHelperOrm();
    com.j256.ormlite.dao.Dao dao = null;
    try {
        dao = db.getDao(po.getClass());
        dao.delete(po);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    } finally {
        if (dao != null) {
            db.close();
            dao = null;
        }
    }
}