private boolean validateIdentityData(java.lang.String fanExternalName, java.lang.String fanPassWord, byte[] fanImageBytes, com.bitdubai.fermat_art_api.all_definition.enums.ArtExternalPlatform externalPlatform) {
    if (fanExternalName.isEmpty())
        return false;
    
    if (fanPassWord.isEmpty())
        return false;
    
    if (fanImageBytes == null)
        return false;
    
    if ((fanImageBytes.length) > 0)
        return true;
    
    return true;
}