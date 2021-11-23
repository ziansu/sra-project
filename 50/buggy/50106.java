@java.lang.Override
public void errorPrint(java.lang.Object msg) {
    if (isLoggingTimestamps()) {
        printErrorTimestamp();
    }else {
        java.lang.System.out.print(generateCode());
    }
    java.lang.System.err.print(msg);
}