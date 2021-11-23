private boolean checkNumberAssignment(java.lang.String[] input) {
    if ((input[1].matches(".*[^1-9].*")) && (!(input[1].contains("0")))) {
        if (input[1].contains(".")) {
            return true;
        }else {
            java.lang.System.out.println("ERROR: Number assignment contains a non-number character.");
            return false;
        }
    }else {
        return true;
    }
}