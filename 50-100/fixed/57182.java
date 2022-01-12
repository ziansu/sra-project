private int convertTaxClass(java.lang.String clazz) {
    switch (clazz) {
        case "I" :
            return 1;
        case "II" :
            return 2;
        case "III" :
            return 3;
        case "IV" :
            return 4;
        case "V" :
            return 5;
        case "VI" :
            return 6;
        default :
            throw new java.lang.IllegalArgumentException(clazz);
    }
}