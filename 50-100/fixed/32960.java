@com.fasterxml.jackson.annotation.JsonIgnore
protected void memoryAndProgressAndTime(int step, int total, long startTime) {
    java.lang.System.out.println(((GlobalOptions.decimalformat.format(((((double) (step)) / ((double) (total))) * 100))) + " %..."));
}