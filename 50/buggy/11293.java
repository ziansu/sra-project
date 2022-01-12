@java.lang.Override
protected boolean checkBundleLocalizedString(java.lang.String key, java.lang.String value) {
    if (com.idega.util.StringUtil.isEmpty(((java.lang.String) (handleGetObject(key))))) {
        return false;
    }else {
        return true;
    }
}