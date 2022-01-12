public static void writeToErr(java.lang.Exception e, java.lang.String message) {
    java.lang.System.err.print((("[" + (java.time.LocalTime.now().toString())) + "] [StreamBot] "));
    e.printStackTrace();
    if (!(message.isEmpty()))
        java.lang.System.err.println(((("[" + (java.time.LocalTime.now().toString())) + "] [StreamBot] ") + message));
    
}