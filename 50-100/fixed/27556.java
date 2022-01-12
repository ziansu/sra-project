public static boolean pickReadWrite(double read, double write) {
    java.util.Random random = new java.util.Random();
    int pick = random.nextInt(100);
    double split = 100 - (read * 100);
    if (pick >= split) {
        return true;
    }else {
        return false;
    }
}