@com.fasterxml.jackson.annotation.JsonIgnore
protected void memoryAndProgressAndTime(int step, int total, long startTime) {
    java.lang.System.out.println(((GlobalOptions.decimalformat.format(((((double) (step)) / ((double) (total))) * 100))) + " %..."));
    java.lang.System.gc();
    java.lang.System.out.println(((((java.lang.Runtime.getRuntime().totalMemory()) - (java.lang.Runtime.getRuntime().freeMemory())) / (1024 * 1024)) + " MB "));
}