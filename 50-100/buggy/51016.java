public static jamEnv.Entity[][] generateGridUpper(jamEnv.Entity[][] lower, int numEnts) {
    JamGrid.gridLower = lower;
    int size = JamGrid.gridLower.length;
    JamGrid.gridUpper = new jamEnv.Entity[size][size];
    jamEnv.JamGridBuilder.insertNewJamAtRandomLoc(1, JamState.PLAYERJAM, JamGrid.gridUpper);
    jamEnv.JamGridBuilder.insertNewJamAt(30, 1, JamState.BADJAM, JamGrid.gridUpper);
    return JamGrid.gridUpper;
}