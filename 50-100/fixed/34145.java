private void initializeRules() {
    rules = new java.util.LinkedList<gps.api.GPSRule>();
    int maxHeight = initBoard.getSize();
    for (int i = 0; i < maxHeight; i++) {
        for (int j = 0; j < maxHeight; j++) {
            for (int k = 1; k < (maxHeight + 1); k++) {
                rules.add(new edificios.BuildingRule(i, j, k));
            }
        }
    }
}