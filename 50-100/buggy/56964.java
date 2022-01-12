public static boolean isPositiveNonZeroInteger(java.lang.String[] parameters) {
    try {
        for (int i = 0; i < (parameters.length); i++) {
            int k = java.lang.Integer.parseInt(parameters[i]);
            if ((i <= 0) && (i > (java.lang.Integer.MAX_VALUE))) {
                return false;
            }
        }
        return true;
    } catch (java.lang.NumberFormatException ex) {
        return false;
    }
}