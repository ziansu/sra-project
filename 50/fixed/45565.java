public java.lang.String getHXid() {
    if ((getString(com.easemob.qixin.parse.QXUser.PROP_HXID)) != null) {
        return getString(com.easemob.qixin.parse.QXUser.PROP_HXID).toLowerCase();
    }
    return getObjectId().toLowerCase();
}