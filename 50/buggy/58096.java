public static com.skilltradiez.skilltraderz.UserDatabase getUserDB() {
    if ((com.skilltradiez.skilltraderz.MasterController.databaseController.getUserDB()) == null)
        com.skilltradiez.skilltraderz.MasterController.databaseController = new com.skilltradiez.skilltraderz.DatabaseController();
    
    return com.skilltradiez.skilltraderz.MasterController.databaseController.getUserDB();
}