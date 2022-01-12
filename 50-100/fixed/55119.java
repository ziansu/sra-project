private boolean validateIdentityData(java.lang.String fanExternalName, byte[] fanImageBytes, com.bitdubai.fermat_art_api.all_definition.enums.ArtExternalPlatform externalPlatform) {
    if (fanExternalName.isEmpty())
        return false;
    
    if (fanImageBytes == null)
        return false;
    
    if ((fanImageBytes.length) > 0)
        return true;
    
    if (externalPlatform != null)
        return true;
    
    return true;
}