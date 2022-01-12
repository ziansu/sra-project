public boolean containsPosition(java.util.ArrayList<Position> positions, Position toCheck) {
    for (Position p : positions) {
        if (((p.getI()) == (toCheck.getI())) && ((p.getJ()) == (toCheck.getJ()))) {
            java.lang.System.out.println("Inside Contais, hi yoyo!");
            return true;
        }
    }
    return false;
}