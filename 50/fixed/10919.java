public static void testisTo(int heading, int radial) {
    com.vor.driver.VORCalculator vc = new com.vor.driver.VORCalculator(new com.vor.driver.VOR());
    boolean result = vc.isTo(heading, radial);
    java.lang.System.out.println(result);
}