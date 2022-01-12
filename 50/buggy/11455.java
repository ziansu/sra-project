public static boolean validateСoefficient(final double coefficient) {
    if (coefficient <= 1.1) {
        return false;
    }
    if (coefficient >= 50.1) {
        return false;
    }
    return true;
}