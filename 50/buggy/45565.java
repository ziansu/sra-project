public java.lang.String getHXid() {
    if ((getObjectId()) != null) {
        return getObjectId().toLowerCase();
    }
    return getString(com.easemob.qixin.parse.QXUser.PROP_HXID);
}