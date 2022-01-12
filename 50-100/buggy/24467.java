public org.gephi.data.attributes.api.AttributeType[] getColumnsToImportTypes() {
    java.util.ArrayList<org.gephi.data.attributes.api.AttributeType> types = new java.util.ArrayList<org.gephi.data.attributes.api.AttributeType>();
    for (int i = 0; i < (columnsCheckBoxes.length); i++) {
        if (columnsCheckBoxes[i].isSelected()) {
            types.add(((org.gephi.data.attributes.api.AttributeType) (columnsComboBoxes[i].getSelectedItem())));
        }
    }
    return types.toArray(new org.gephi.data.attributes.api.AttributeType[0]);
}