@java.lang.Override
public java.awt.Component getListCellRendererComponent(javax.swing.JList list, java.lang.Object value, int index, boolean isSelected, boolean cellHasFocus) {
    if (value == null) {
        setText("<Select a datasource>");
    }else {
        it.unibz.krdb.obda.model.OBDADataSource datasource = ((it.unibz.krdb.obda.model.OBDADataSource) (value));
        java.lang.String datasourceUri = datasource.getSourceID().toString();
        setText(datasourceUri);
    }
    return this;
}