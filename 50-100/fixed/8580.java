public static void main(java.lang.String[] args) {
    boolean success = false;
    try {
        new com.android.commands.sm.Sm().run(args);
        success = true;
    } catch (java.lang.Exception e) {
        if (e instanceof java.lang.IllegalArgumentException) {
            com.android.commands.sm.Sm.showUsage();
            java.lang.System.exit(1);
        }
        android.util.Log.e(com.android.commands.sm.Sm.TAG, "Error", e);
        java.lang.System.err.println(("Error: " + e));
    }
    java.lang.System.exit((success ? 0 : 1));
}