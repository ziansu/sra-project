private static void combineArrList(java.util.ArrayList<java.lang.String[]> displayAL, java.util.ArrayList<java.lang.String[]> upComingAL) {
    if (!(displayAL.isEmpty())) {
        for (int i = 1; i < (displayAL.size()); i++) {
            upComingAL.add(displayAL.get(i));
        }
    }
}