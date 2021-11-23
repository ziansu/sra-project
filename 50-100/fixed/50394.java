private static int findIndiID(java.lang.String indiID) {
    for (int i = 0; i < ((cs555_ged.CS555_GED.iCounter) + 1); i++) {
        if (cs555_ged.CS555_GED.indArr[i].getID().equals(indiID)) {
            return i;
        }
    }
    return -1;
}