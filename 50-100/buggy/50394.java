private static int findIndiID(java.lang.String indiID) {
    int found = -1;
    for (int i = 0; i < ((cs555_ged.CS555_GED.iCounter) + 1); i++) {
        if (cs555_ged.CS555_GED.indArr[i].getID().equals(indiID)) {
            return i;
        }
    }
    return found;
}