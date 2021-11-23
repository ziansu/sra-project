public static void printError(final com.alphatica.genotick.genotick.ErrorCode error) {
    java.lang.System.out.println(java.lang.String.format("Program finished with error code %s(%d)", error.toString(), error.getValue()));
}