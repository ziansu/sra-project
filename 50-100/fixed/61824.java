public static void testUpdateKeychain(postit.server.controller.KeychainHandler kh, int directoryEntryId, java.lang.String name, java.lang.String encryptKey, java.lang.String password, java.lang.String metadata) {
    boolean res = kh.updateKeychain(directoryEntryId, name, encryptKey, password, metadata);
    java.lang.System.out.printf("Updating keychain %d (%s,%s,%s,%s) %s\n", directoryEntryId, name, encryptKey, password, metadata, (res ? "successful" : "failed"));
}