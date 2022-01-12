public edu.nmsu.Area getColorSelectionArea() {
    edu.nmsu.Area area = new edu.nmsu.Area(margin, ((margin) + ((((availableColors.size()) + 1) / (columns)) * (boxLength))), margin, ((margin) + ((boxLength) * (columns))));
    return area;
}