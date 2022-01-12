public static void selfTest() {
    nachos.threads.Lib.debug(nachos.threads.KThread.dbgThread, "Enter KThread.selfTest");
    new nachos.threads.KThread(new nachos.threads.KThread.PingTest(1)).setName("forked thread").fork();
    new nachos.threads.KThread.PingTest(0).run();
    nachos.threads.KThread.joinTest();
}