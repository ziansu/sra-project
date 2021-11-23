public void selfTest() {
    nachos.threads.KThread.selfTest();
    nachos.threads.KThread.selfTest2();
    nachos.threads.KThread.selfTest3();
    nachos.threads.Semaphore.selfTest();
    nachos.threads.SynchList.selfTest();
    nachos.threads.Condition2.selfTest();
    nachos.threads.Communicator.selfTest();
    nachos.threads.ThreadedKernel.alarm.selfTest();
    nachos.threads.PriorityScheduler.selfTest();
    if ((nachos.threads.Machine.bank()) != null) {
        nachos.threads.ElevatorBank.selfTest();
    }
}