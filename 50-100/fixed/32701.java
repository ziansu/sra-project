public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    if (((feet < 0) || (inches < 0)) || (inches > 12)) {
        java.lang.System.out.println("Invalid feet or inches parameters");
        return -1;
    }
    double centimeters = (feet * 12) * 2.54;
    centimeters += inches * 2.54;
    java.lang.System.out.println((((((feet + " feet ") + inches) + " inches = ") + centimeters) + " cm"));
    return centimeters;
}