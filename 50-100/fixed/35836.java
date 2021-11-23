public java.lang.String toString() {
    java.lang.String str = "";
    str += ("Firing solultion at time: " + (firedTime)) + "\n";
    str += ("firingPosition" + (firingPosition)) + ":\n";
    str += ("firingAngle" + (firingAngle)) + ":\n";
    if ((targetPosition) != null) {
        str += ("targerPosition" + (targetPosition)) + ":\n";
    }
    return str;
}