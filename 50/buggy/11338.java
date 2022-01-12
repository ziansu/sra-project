@java.lang.Override
public java.lang.Object get(java.lang.Object key) {
    com.wm.data.IDataCursor cursor = this.getCursor();
    java.lang.Object value = com.wm.data.IDataUtil.get(cursor, ((java.lang.String) (key)));
    cursor.destroy();
    return value;
}