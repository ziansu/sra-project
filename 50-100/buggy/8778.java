private void setZeroValues(java.lang.String values) {
    java.lang.String[] sr = values.split(",");
    for (int i = 0; i < (sr.length); i++) {
        int num = java.lang.Integer.MIN_VALUE;
        try {
            num = java.lang.Integer.parseInt(sr[i]);
        } catch (java.lang.NumberFormatException nfe) {
            break;
        }
        zeroValues.add(num);
    }
}