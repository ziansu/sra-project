public static java.lang.String[] toMhz(java.lang.String... values) {
    java.lang.String[] frequency = new java.lang.String[values.length];
    for (int i = 0; i < (values.length); i++) {
        try {
            frequency[i] = ((java.lang.Integer.parseInt(values[i].trim())) / (1000 * 1000)) + " Mhz";
        } catch (java.lang.NumberFormatException nfe) {
            nfe.printStackTrace();
        }
    }
    return frequency;
}