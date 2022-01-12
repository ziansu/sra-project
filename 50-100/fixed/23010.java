@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
        userIdentitySubAppSession = ((com.bitdubai.fermat_dap_android_sub_app_asset_user_identity_bitdubai.session.UserIdentitySubAppSession) (appSession));
        moduleManager = userIdentitySubAppSession.getModuleManager();
        errorManager = appSession.getErrorManager();
    } catch (java.lang.Exception ex) {
        com.bitdubai.fermat_dap_android_sub_app_asset_user_identity_bitdubai.util.CommonLogger.exception(com.bitdubai.fermat_dap_android_sub_app_asset_user_identity_bitdubai.fragments.CreateIdentityFragment.TAG, ex.getMessage(), ex);
    }
}