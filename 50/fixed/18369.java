public static void main(java.lang.String[] argArray) throws java.io.IOException {
    int result = new com.android.dx.command.dexer.Main().run(argArray, null, null);
    if (result != 0) {
        java.lang.System.exit(result);
    }
}