@java.lang.Override
protected boolean checkBundleLocalizedString(java.lang.String key, java.lang.String value) {
    return !(com.idega.util.StringUtil.isEmpty(((java.lang.String) (handleGetObject(key)))));
}