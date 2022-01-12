@java.lang.Override
protected java.lang.Object coerceFromString(java.lang.String value) throws org.zkoss.zk.ui.WrongValueException {
    if ((value == null) || (value.isEmpty())) {
        return null;
    }
    java.util.Date date = org.carewebframework.common.DateUtil.parseDate(value);
    if (date == null) {
        throw showCustomError(new org.zkoss.zk.ui.WrongValueException(this, org.zkoss.zul.mesg.MZul.DATE_REQUIRED, new java.lang.Object[]{ value , datebox.getFormat() }));
    }
    return date;
}