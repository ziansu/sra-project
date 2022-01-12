public java.lang.String getSwitchType() {
    java.lang.String switchType = beanTypeList.getSelectedItem().toString();
    if (switchType.equals(jmri.jmrit.display.switchboardEditor.SwitchboardEditor._light)) {
        typePrefix = "L";
    }else
        if (switchType.equals(jmri.jmrit.display.switchboardEditor.SwitchboardEditor._sensor)) {
            typePrefix = "S";
        }else {
            typePrefix = "T";
        }
    
    return typePrefix;
}