protected java.lang.String[] parseStringList(java.lang.String value) {
    java.lang.String[] values;
    if ((value.indexOf(stringsDelimiter)) < 0) {
        values = new java.lang.String[]{ value };
    }else {
        values = value.split(stringsDelimiter);
    }
    return values;
}