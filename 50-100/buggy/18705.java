private boolean validateDownLeftCorner(java.util.ArrayList<Model.Cell> downLeftCells, Model.Position position, int value) {
    int incidentCount = actualIncidentLinesDownLeft(downLeftCells, position, value);
    return incidentCount <= ((corners.get(position)) == null ? corners.get(position).getDowmLeft() : 0);
}