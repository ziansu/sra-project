public void processRestData(java.util.ArrayList<com.app.domain.Coordinate> coordinates) {
    coordinateDao.insertRawBatch(coordinates, coordRawTableName);
}