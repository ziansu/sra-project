private com.stratelia.silverpeas.pdc.control.UsedAxis getUsedAxis(java.util.List<com.stratelia.silverpeas.pdc.control.UsedAxis> usedAxis, int axisId) {
    java.util.Iterator<com.stratelia.silverpeas.pdc.control.UsedAxis> iterator = usedAxis.iterator();
    com.stratelia.silverpeas.pdc.control.UsedAxis uAxis = null;
    while (iterator.hasNext()) {
        uAxis = iterator.next();
        if ((uAxis.getAxisId()) == axisId) {
            return uAxis;
        }
    } 
    return null;
}