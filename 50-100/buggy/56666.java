public org.bson.Document createPermission(java.lang.String salt, java.lang.String authId, protobuf.srl.services.authentication.Authentication.AuthResponse.PermissionLevel level) throws java.lang.Exception {
    java.lang.String hash = null;
    hash = coursesketch.server.authentication.HashManager.toHex(coursesketch.server.authentication.HashManager.createHash(authId, salt).getBytes());
    java.lang.System.out.println((((((("HASH FOR ID: " + authId) + "+ SALT: ") + salt) + " IS [") + hash) + "]"));
    return new org.bson.Document(hash, level.getNumber());
}