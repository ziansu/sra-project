@java.lang.Override
public java.util.List<com.nervousfish.nervousfish.data_objects.Profile> getProfiles() throws java.io.IOException {
    final java.lang.String profilesPath = this.constants.getDatabaseUserdataPath();
    final com.google.gson.GsonBuilder gsonBuilder = new com.google.gson.GsonBuilder().registerTypeHierarchyAdapter(com.nervousfish.nervousfish.data_objects.IKey.class, new com.nervousfish.nervousfish.modules.database.GsonKeyAdapter());
    final com.google.gson.Gson gsonParser = gsonBuilder.create();
    final java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(profilesPath), java.nio.charset.StandardCharsets.UTF_8));
    final java.util.List<com.nervousfish.nervousfish.data_objects.Profile> profile = gsonParser.fromJson(reader, com.nervousfish.nervousfish.modules.database.GsonDatabaseAdapter.TYPE_PROFILE_LIST);
    reader.close();
    return profile;
}