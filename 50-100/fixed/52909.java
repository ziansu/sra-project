public static java.util.List<Model.StatisticModel> convertListOfDbObjects(java.util.List<com.mongodb.DBObject> mongoStat) {
    java.util.List<Model.StatisticModel> result = new java.util.ArrayList<Model.StatisticModel>();
    if (!(mongoStat.isEmpty())) {
        for (com.mongodb.DBObject row : mongoStat) {
            result.add(Mappers.StatisticMapper.convertDbObject(row));
        }
    }
    return result;
}