@java.lang.Override
public java.lang.String getFullKey(java.lang.String userKey) {
    return com.rhfung.P2PDictionary.P2PDictionary.GetFullKey(com.rhfung.P2PDictionary.P2PDictionary.DATA_NAMESPACE, this._partition, userKey);
}