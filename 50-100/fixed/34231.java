public void deleteGarden(java.lang.String gardenName, android.content.Context context) {
    com.grupp3.projekt_it.Garden garden = loadGarden(gardenName, context);
    java.lang.String tableName = garden.getTableName();
    com.grupp3.projekt_it.SQLPlantHelper sqlPlantHelper = new com.grupp3.projekt_it.SQLPlantHelper(context);
    sqlPlantHelper.deleteTable(tableName);
    context.deleteFile((gardenName + ".grdn"));
}