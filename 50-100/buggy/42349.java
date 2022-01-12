@java.lang.Override
protected void computeFields() {
    super.computeFields();
    if ((hFields) == null) {
        hFields = new int[super.fields.length];
    }
    int[] hDateInfo = com.github.msarhan.ummalqura.calendar.UmmalquraGregorianConverter.toHijri(getTime());
    hFields[java.util.Calendar.YEAR] = hDateInfo[0];
    hFields[java.util.Calendar.MONTH] = hDateInfo[1];
    hFields[java.util.Calendar.DAY_OF_MONTH] = hDateInfo[2];
}