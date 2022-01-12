public static boolean validateVlan(java.lang.String vlan) {
    boolean valid = true;
    try {
        if (vlan.trim().isEmpty()) {
            valid = false;
        }
    } catch (java.lang.NullPointerException e) {
        valid = false;
    }
    return valid;
}