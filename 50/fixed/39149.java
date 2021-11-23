@java.lang.Override
public void propertyChange(java.beans.PropertyChangeEvent evt) {
    setListDelimiter(colIdx, ((java.lang.String) (evt.getNewValue())));
    updatePreviewTable();
}