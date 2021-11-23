private void generateIdClient() {
    if ((containerPreferences.getClientId()) == null) {
        java.lang.String idClient = java.util.UUID.randomUUID().toString();
        containerPreferences.setClientId(idClient);
    }
}