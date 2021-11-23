@com.fasterxml.jackson.annotation.JsonIgnore
protected void memoryAndProgress(int step, int total) {
    java.lang.System.out.println(((GlobalOptions.decimalformat.format(((((double) (step)) / ((double) (total))) * 100))) + " %..."));
}