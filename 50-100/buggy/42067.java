public static java.util.List<com.cherednichenko.antonina.detoxdiet.detox_diet_data.ProgramInfo> getAllPrograms(android.content.Context context) {
    if (com.cherednichenko.antonina.detoxdiet.detox_diet_data.DataProcessor.dbIsInitilized) {
        com.cherednichenko.antonina.detoxdiet.db.ProgramsDatabaseHelper databaseHelper = com.cherednichenko.antonina.detoxdiet.db.ProgramsDatabaseHelper.getInstance(context);
        return databaseHelper.getAllPrograms();
    }else {
        com.cherednichenko.antonina.detoxdiet.detox_diet_data.DataProcessor.dbIsInitilized = true;
        return com.cherednichenko.antonina.detoxdiet.detox_diet_data.DataProcessor.readJsonAndInitDb(context);
    }
}