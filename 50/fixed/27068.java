public static long getUsage() {
    return ((java.lang.Runtime.getRuntime().totalMemory()) - (java.lang.Runtime.getRuntime().freeMemory())) / 1048576;
}