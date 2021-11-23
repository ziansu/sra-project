public boolean ExistIdentity() throws com.bitdubai.fermat_cht_api.all_definition.exceptions.CHTException {
    try {
        if (!(moduleManager.getIdentityChatUser().getAlias().isEmpty())) {
            android.util.Log.i("CHT EXIST IDENTITY", "TRUE");
            return true;
        }
    } catch (java.lang.Exception e) {
        return false;
    }
    android.util.Log.i("CHT EXIST IDENTITY", "FALSE");
    return false;
}