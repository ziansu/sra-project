public boolean lengthIsApproximately(float value, float tolerance) {
    if (tolerance < 0.0F) {
        throw new java.lang.IllegalArgumentException("Comparison tolerance cannot be less than zero.");
    }
    if ((java.lang.Math.abs(((this.length()) - 1.0F))) < tolerance) {
        return true;
    }
    return false;
}