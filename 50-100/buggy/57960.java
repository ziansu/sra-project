private static void combineArrList(java.util.ArrayList<java.lang.String[]> displayAL, java.util.ArrayList<java.lang.String[]> upComingAL) {
    for (int i = 1; i < (displayAL.size()); i++) {
        upComingAL.add(displayAL.get(i));
        for (int j = 0; j < (displayAL.get(i).length); j++) {
        }
    }
}