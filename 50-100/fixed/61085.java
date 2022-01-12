public static boolean validateVer(java.lang.String ver) {
    boolean valid = true;
    try {
        java.lang.Double.parseDouble(ver.trim());
    } catch (java.lang.NumberFormatException e) {
        java.lang.System.out.println("Not an integer");
        valid = false;
    } catch (java.lang.NullPointerException e) {
        valid = false;
    }
    return valid;
}