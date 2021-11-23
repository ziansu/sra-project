protected java.lang.String getAuxDatumValue(final uk.ac.starlink.table.ColumnInfo colInfo, final java.lang.String auxDatumName) {
    uk.ac.starlink.table.DescribedValue value = colInfo.getAuxDatumByName(auxDatumName);
    return value != null ? value.getValue().toString() : null;
}