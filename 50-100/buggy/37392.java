@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent evt) {
    final org.cytoscape.tableimport.internal.util.AttributeDataType newDataType = ((org.cytoscape.tableimport.internal.util.AttributeDataType) (evt.getNewValue()));
    if (newDataType.isList())
        setListDelimiter(colIdx, attrEditorPanel.getListDelimiter());
    
    setDataType(colIdx, newDataType);
    updatePreviewTable(colIdx);
}