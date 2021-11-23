public int containsPosition(java.util.ArrayList<Position> positions, Position toCheck) {
    for (int i = 0; i < (positions.size()); i++) {
        if (((positions.get(i).getI()) == (toCheck.getI())) && ((positions.get(i).getJ()) == (toCheck.getJ()))) {
            java.lang.System.out.println("Inside Contais, hi yoyo!");
            return i;
        }
    }
    return -1;
}