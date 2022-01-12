java.util.ArrayList getArrayAbschnitt(java.util.ArrayList list, int i, int j) {
    java.lang.System.out.println(("list vor Abschnitt " + list));
    java.util.ArrayList abschnitt = new java.util.ArrayList<>();
    for (int k = i; k < (j + 1); k++) {
        abschnitt.add(list.get(k));
    }
    java.lang.System.out.println(((((("list nach Abschnitt von" + i) + "bis") + j) + "ist") + abschnitt));
    return abschnitt;
}