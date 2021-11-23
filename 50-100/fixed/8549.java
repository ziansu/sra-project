@java.lang.Override
public java.awt.Component getListCellRendererComponent(javax.swing.JList<? extends it.unibz.krdb.obda.model.OBDADataSource> list, it.unibz.krdb.obda.model.OBDADataSource value, int index, boolean isSelected, boolean cellHasFocus) {
    if (value == null) {
        setText("<Select a datasource>");
    }else {
        java.lang.String datasourceUri = value.getSourceID().toString();
        setText(datasourceUri);
    }
    return this;
}