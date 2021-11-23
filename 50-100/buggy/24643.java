@java.lang.Override
public void copyPositions(int fromObjectId, java.lang.String fromInstanceId, int toObjectId, java.lang.String toInstanceId) throws com.stratelia.silverpeas.pdc.control.PdcException {
    java.util.List<com.stratelia.silverpeas.pdc.control.ClassifyPosition> positions = getPositions(fromObjectId, fromInstanceId);
    java.util.List<com.stratelia.silverpeas.pdc.control.UsedAxis> usedAxis = getUsedAxisByInstanceId(toInstanceId);
    com.stratelia.silverpeas.pdc.control.ClassifyPosition newPosition = null;
    for (com.stratelia.silverpeas.pdc.control.ClassifyPosition position : positions) {
        newPosition = checkClassifyPosition(position, usedAxis);
        if (newPosition != null) {
            addPosition(toObjectId, newPosition, toInstanceId);
        }
    }
}