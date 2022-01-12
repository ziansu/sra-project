private void saveAllPoints() throws java.sql.SQLException {
    ru.sukharev.pathtracker.provider.DatabaseHelper.PointDAO dao = mDatabaseHelper.getPointDAO();
    for (ru.sukharev.pathtracker.utils.orm.MapPoint mapPoint : mPoints)
        dao.create(mapPoint);
    
}