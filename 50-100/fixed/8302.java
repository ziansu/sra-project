public void run() {
    while ((inspecteeThread.getState()) != (java.lang.Thread.State.TERMINATED)) {
        try {
            java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> stacks = java.lang.Thread.getAllStackTraces();
            java.lang.System.out.println(java.util.Arrays.toString(stacks.get(inspecteeThread)));
        } catch (java.lang.Exception e) {
        }
    } 
}