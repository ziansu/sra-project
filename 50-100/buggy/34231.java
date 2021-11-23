public void deleteGarden(java.lang.String gardenName, android.content.Context context) {
    context.deleteFile((gardenName + ".grdn"));
    com.grupp3.projekt_it.SQLPlantHelper sqlPlantHelper = new com.grupp3.projekt_it.SQLPlantHelper(context);
    com.grupp3.projekt_it.Garden garden = loadGarden(gardenName, context);
    java.lang.String tableName = garden.getTableName();
    sqlPlantHelper.deleteTable(tableName);
}