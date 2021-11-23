private void generateIdClient() {
    java.lang.String idClient = java.util.UUID.randomUUID().toString();
    containerPreferences.setClientId(idClient);
}