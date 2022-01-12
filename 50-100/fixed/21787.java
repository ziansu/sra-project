private java.lang.String getStackTrace(java.lang.Throwable e) {
    java.lang.String result = "";
    result += (e.getMessage()) + "\n";
    java.lang.StackTraceElement[] lists = e.getStackTrace();
    for (java.lang.StackTraceElement list : lists) {
        result += (list.toString()) + "\n";
    }
    return result;
}