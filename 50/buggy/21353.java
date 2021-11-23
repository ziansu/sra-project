@java.lang.Override
public java.lang.Void call() throws javax.portlet.ReadOnlyException {
    java.lang.String encodedKey = _encodeKey(namespace, key);
    if (values != null) {
        com.liferay.portlet.PortalPreferencesImpl.super.setValues(encodedKey, values);
    }else {
        reset(encodedKey);
    }
    return null;
}