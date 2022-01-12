@java.lang.Override
public void nullSafeSet(java.sql.PreparedStatement arg0, java.lang.Object arg1, int arg2, org.hibernate.engine.spi.SessionImplementor arg3) throws java.sql.SQLException {
    java.lang.Long pvalue = null;
    if (arg1 != null) {
        pvalue = ((java.lang.Long) (arg1));
    }
    if (pvalue != null) {
        arg0.setLong(arg2, pvalue);
    }else {
        arg0.setLong(arg2, 0L);
    }
}