static java.lang.String Round(java.lang.String currentTemp) {
    double tempDouble = java.lang.Double.parseDouble(currentTemp);
    if ((java.lang.Math.abs(tempDouble)) < 10) {
        return java.lang.String.valueOf(tempDouble);
    }else {
        int tempInt = ((int) (java.lang.Math.round(tempDouble)));
        return java.lang.String.valueOf(tempInt);
    }
}