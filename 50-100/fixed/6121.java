@java.lang.Override
public java.util.List<ru.aviaj.model.Place> handle(java.sql.ResultSet resultSet) throws java.sql.SQLException {
    final java.util.List<ru.aviaj.model.Place> bufferPlaceList = new java.util.ArrayList<>();
    while (resultSet.next()) {
        bufferPlaceList.add(new ru.aviaj.model.Place(resultSet.getLong("id"), resultSet.getString("title"), null, resultSet.getDouble("longitude"), resultSet.getDouble("latitude")));
    } 
    return bufferPlaceList;
}