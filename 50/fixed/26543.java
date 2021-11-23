@java.lang.Override
public com.bitdubai.fermat_dap_api.layer.dap_identity.asset_user.interfaces.IdentityAssetUser createNewIdentityAssetUser(java.lang.String alias, byte[] profileImage) throws com.bitdubai.fermat_dap_api.layer.dap_identity.asset_user.exceptions.CantCreateNewIdentityAssetUserException {
    return identityAssetUserManager.createNewIdentityAssetUser(alias, profileImage);
}