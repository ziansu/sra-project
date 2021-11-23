private java.lang.String isValueNameExist(java.util.List<com.stratelia.silverpeas.pdc.control.Value> values, java.util.List<com.stratelia.silverpeas.pdc.control.Value> valuesToCheck) {
    java.util.Iterator<com.stratelia.silverpeas.pdc.control.Value> it = valuesToCheck.iterator();
    com.stratelia.silverpeas.pdc.control.Value valueToCheck;
    java.lang.String valueName = null;
    while (it.hasNext()) {
        valueToCheck = it.next();
        if (isValueNameExist(values, valueToCheck)) {
            valueName = valueToCheck.getName();
            break;
        }
    } 
    return valueName;
}