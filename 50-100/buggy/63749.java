@java.lang.Override
public java.math.BigDecimal getBigDecimal(java.lang.String name) {
    java.lang.String str = getString(name).trim();
    if ((str != null) && (!(str.isEmpty()))) {
        if (str.contains(net.iryndin.jdbf.impl.DBFRecordImpl.NUMERIC_OVERFLOW)) {
            return null;
        }
        return new java.math.BigDecimal(str);
    }
    return null;
}