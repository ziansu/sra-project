private static double calcFeetAndInchesToCentimeters(int feet, double inches) {
    if (!(((feet >= 0) && (inches >= 0)) && (inches <= 12))) {
        return -1;
    }else {
        int feetInInches = feet * 12;
        double totalInches = feetInInches + inches;
        double cm = totalInches * 2.54;
        return cm;
    }
}