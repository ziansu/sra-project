@java.lang.Override
public java.util.List<com.nervousfish.nervousfish.data_objects.Contact> getAllContacts() throws java.io.IOException {
    final com.google.gson.GsonBuilder gsonBuilder = new com.google.gson.GsonBuilder().registerTypeHierarchyAdapter(com.nervousfish.nervousfish.data_objects.IKey.class, new com.nervousfish.nervousfish.modules.database.GsonKeyAdapter());
    final com.google.gson.Gson gsonParser = gsonBuilder.create();
    final java.lang.String contactsPath = this.constants.getDatabaseContactsPath();
    final java.io.Reader reader = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(contactsPath), java.nio.charset.StandardCharsets.UTF_8));
    final java.util.List<com.nervousfish.nervousfish.data_objects.Contact> contacts = gsonParser.fromJson(reader, com.nervousfish.nervousfish.modules.database.GsonDatabaseAdapter.TYPE_CONTACT_LIST);
    reader.close();
    return contacts;
}