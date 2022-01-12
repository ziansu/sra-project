@java.lang.Override
public void preserveManagement(java.util.Hashtable<java.lang.String, java.lang.Object> management) {
    serializeAndStore(management, model.UserSettings.FILEPATH_MANAGEMENT);
}