public Transmission searchForTransmission(java.lang.String transmission, User currentUser, java.util.ArrayList<Transmission> mtl) {
    java.lang.System.out.println("");
    java.util.ArrayList<Transmission> visibleTransmissions = getVisibleTransmissions(currentUser, mtl);
    boolean foundTransmission = false;
    for (Transmission t : visibleTransmissions) {
        if (t.getMessage().contains(transmission)) {
            java.lang.System.out.println(t.toString());
            foundTransmission = true;
        }
    }
    if (!foundTransmission) {
        java.lang.System.out.println(("No transmission found containing" + " your search.\n"));
    }
    return null;
}