public java.lang.String getCleanPattern(org.pentaho.di.core.row.RowMetaInterface data, java.lang.Object[] r, java.lang.String fieldNum, java.lang.String selectedPattern, java.lang.String customCode) throws org.pentaho.di.core.exception.KettleValueException {
    java.lang.String replace_pattern = "";
    int _intfieldNum = java.lang.Integer.parseInt(fieldNum);
    java.lang.String data_row = data.getString(r, _intfieldNum);
    java.lang.String SpecialCleaner = data_row.replaceAll(selectedPattern, replace_pattern);
    return SpecialCleaner;
}