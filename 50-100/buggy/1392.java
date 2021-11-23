@java.lang.Override
public void onPropertyChange(java.lang.String propertyName, java.lang.String newValue) {
    super.onPropertyChange(propertyName, newValue);
    if (propertyName.equals(com.google.appinventor.client.editor.simple.components.MockHVArrangement.PROPERTY_NAME_HORIZONTAL_ALIGNMENT)) {
        myLayout.setHAlignmentFlags(newValue);
        refreshForm();
    }else
        if (propertyName.equals(com.google.appinventor.client.editor.simple.components.MockHVArrangement.PROPERTY_NAME_VERTICAL_ALIGNMENT)) {
            myLayout.setVAlignmentFlags(newValue);
            refreshForm();
        }else {
            if ((propertyName.equals(com.google.appinventor.client.editor.simple.components.PROPERTY_NAME_WIDTH)) || (propertyName.equals(com.google.appinventor.client.editor.simple.components.PROPERTY_NAME_HEIGHT))) {
                adjustAlignmentDropdowns();
                refreshForm();
            }
        }
    
}