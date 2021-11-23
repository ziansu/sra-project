private void updateSchema() {
    try {
        avroSchema = new org.apache.avro.Schema.Parser().parse(new java.io.File(transMeta.environmentSubstitute(wSchema.getText())));
        validSchema = true;
        wFields.setColumnInfo(1, new org.pentaho.di.ui.core.widget.ColumnInfo(org.pentaho.di.i18n.BaseMessages.getString(org.openbi.kettle.plugins.avrooutput.AvroOutputDialog.PKG, "AvroOutputDialog.AvroColumn.Column"), org.pentaho.di.ui.core.widget.ColumnInfo.COLUMN_TYPE_CCOMBO, getSchemaFields(), false));
    } catch (java.lang.Exception ex) {
        validSchema = false;
        avroSchema = null;
    }
}