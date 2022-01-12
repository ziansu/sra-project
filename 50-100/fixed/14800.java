public static double getPercentage(int Level) {
    if (Level == 1) {
        return 100;
    }
    double percentage = (((java.lang.Double.valueOf(Level)) / (java.lang.Double.valueOf((Level - 1)))) - 1) * 100;
    return (java.lang.Math.round((percentage * 10))) / 10;
}