public boolean validatePasswordStrength(java.lang.String input) {
    boolean valid = true;
    valid &= !(input.equals(""));
    return valid;
}