protected final int getInt(java.lang.String tag, int defaultValue) {
    java.lang.String v = this.getString(tag);
    return org.giiwa.core.bean.Bean.toInt(v, defaultValue);
}