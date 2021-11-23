private mil.nga.giat.mage.sdk.datastore.user.Permissions parsePermissions(com.fasterxml.jackson.core.JsonParser parser) throws java.io.IOException {
    if ((parser.getCurrentToken()) != (com.fasterxml.jackson.core.JsonToken.START_ARRAY))
        return null;
    
    java.util.Collection<mil.nga.giat.mage.sdk.datastore.user.Permission> permissions = new java.util.ArrayList<>();
    while ((parser.nextToken()) != (com.fasterxml.jackson.core.JsonToken.END_ARRAY)) {
        java.lang.String permission = parser.getText().toUpperCase(java.util.Locale.US);
        permissions.add(mil.nga.giat.mage.sdk.datastore.user.Permission.valueOf(permission));
    } 
    return new mil.nga.giat.mage.sdk.datastore.user.Permissions(permissions);
}