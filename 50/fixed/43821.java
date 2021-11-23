public static void selfTest() {
    nachos.ag.BoatGrader b = new nachos.ag.BoatGrader();
    java.lang.System.out.println("\n ***Testing Boats with only 3 children***");
    nachos.threads.Boat.begin(1, 2, b);
}