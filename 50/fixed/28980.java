public static void appTest() {
    Test.App appA = new Test.App(0);
    Test.App appB = new Test.App(1);
    appA.nextRequest();
    appB.nextRequest();
}