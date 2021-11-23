public boolean hasChanged() {
    java.lang.String sNewValue = jtfValue.getText();
    java.lang.String sOldValue = entry.sValue;
    if ((sNewValue == null) && (sOldValue == null))
        return true;
    
    if ((sNewValue == null) && (sOldValue != null))
        return true;
    
    if ((sNewValue != null) && (sOldValue == null))
        return true;
    
    if (!(sNewValue.equals(sOldValue)))
        return true;
    
    return false;
}