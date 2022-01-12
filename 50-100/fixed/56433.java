public int execute() {
    if (imageIsInvalid())
        return com.bitbudai.fermat_cht_android_sub_app_chat_identity_bitdubai.util.CreateChatIdentityExecutor.MISSING_IMAGE;
    
    if (entryDataIsInvalid())
        return com.bitbudai.fermat_cht_android_sub_app_chat_identity_bitdubai.util.CreateChatIdentityExecutor.INVALID_ENTRY_DATA;
    
    try {
        android.util.Log.i("CHT CREATE IDENTITY", ((identityName) + (imageInBytes)));
        moduleManager.createNewIdentityChat(identityName, imageInBytes);
    } catch (com.bitdubai.fermat_cht_api.layer.identity.exceptions.CantCreateNewChatIdentityException e) {
        e.printStackTrace();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return com.bitbudai.fermat_cht_android_sub_app_chat_identity_bitdubai.util.CreateChatIdentityExecutor.SUCCESS;
}