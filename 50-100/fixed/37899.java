public boolean setLicenseStatus(java.lang.String[] lic) {
    int[] vals = new int[2];
    try {
        vals[0] = java.lang.Integer.parseInt(lic[0]);
        vals[1] = java.lang.Integer.parseInt(lic[1]);
    } catch (java.lang.NumberFormatException ex) {
        return false;
    }
    licenseState = vals[0];
    customEnabled = (vals[1]) != 0;
    return true;
}