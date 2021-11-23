public void printDoneData() {
    double averageWaitingTime = 0;
    for (java.lang.Process p : doneProcesses) {
        averageWaitingTime += p.getAwaitTime();
        java.lang.System.out.print(p.toString());
    }
    averageWaitingTime /= doneProcesses.length;
    java.lang.System.out.printf("For:%5d  Processes Average waiting time was:%6.1f%n", doneProcesses.length, averageWaitingTime);
}