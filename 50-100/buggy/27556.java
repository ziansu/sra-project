public static boolean pickReadWrite(double read, double write) {
    java.util.Random random = new java.util.Random();
    int pick = random.nextInt(100);
    if (pick >= (read * 100)) {
        return true;
    }else {
        return false;
    }
}