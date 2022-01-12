public boolean ExistIdentity() throws com.bitdubai.fermat_cht_api.all_definition.exceptions.CHTException {
    try {
        if ((moduleManager.getIdentityChatUser().getAlias().length()) > 0)
            return true;
        
        if ((moduleManager.getIdentityChatUser().getImage().length) > 0)
            return true;
        
        android.util.Log.i("CHT EXIST IDENTITY", "TRUE");
    } catch (java.lang.Exception e) {
        android.util.Log.i("CHT EXIST IDENTITY", "FALSE");
        return false;
    }
    android.util.Log.i("CHT EXIST IDENTITY", "FALSE");
    return false;
}