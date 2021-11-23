public static java.util.List<com.cherednichenko.antonina.detoxdiet.detox_diet_data.ProgramInfo> getAllPrograms(android.content.Context context) {
    com.cherednichenko.antonina.detoxdiet.db.ProgramsDatabaseHelper databaseHelper = com.cherednichenko.antonina.detoxdiet.db.ProgramsDatabaseHelper.getInstance(context);
    if (!(com.cherednichenko.antonina.detoxdiet.detox_diet_data.DataProcessor.dbIsInitilized)) {
        com.cherednichenko.antonina.detoxdiet.detox_diet_data.DataProcessor.dbIsInitilized = true;
        com.cherednichenko.antonina.detoxdiet.detox_diet_data.DataProcessor.readJsonAndInitDb(context);
    }
    return databaseHelper.getAllPrograms();
}