private void createIdentity(java.lang.String fanExternalName, com.bitdubai.fermat_art_api.all_definition.enums.ArtExternalPlatform externalPlatform) throws com.bitdubai.fermat_art_api.layer.identity.fan.exceptions.CantCreateFanIdentityException, com.bitdubai.fermat_art_api.layer.identity.fan.exceptions.FanIdentityAlreadyExistsException {
    if ((externalPlatformID) != null) {
        moduleManager.createFanaticIdentity(fanExternalName, ((fanImageByteArray) == null ? convertImage(R.drawable.ic_profile_male) : fanImageByteArray), externalPlatformID);
    }else {
    }
}