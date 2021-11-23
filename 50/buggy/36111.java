protected final long getLong(java.lang.String tag, long defaultvalue) {
    java.lang.String v = this.getString(tag);
    return org.giiwa.core.bean.Bean.toLong(v, defaultvalue);
}