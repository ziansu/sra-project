public void setupEncryption(android.content.Context context) {
    java.lang.String alias = getKeyAlias();
    if (alias.equals(ca.alexland.renewpass.utils.PreferenceHelper.DEFAULT_VALUE_STRING)) {
        alias = this.getUsername();
        setKeyAlias(alias);
    }
    keysExist = keyStoreUtil.keysExist();
    if (!(keysExist)) {
        setupKeys(context);
    }
}