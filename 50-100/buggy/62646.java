public static void error(java.lang.String location, java.lang.String error, java.lang.Throwable cause) {
    if (sutilities.Debugger.isInDebugMode_) {
        java.lang.System.out.println(((location + ": ") + error));
        cause.printStackTrace();
    }
    if ((sutilities.Debugger.logger_) != null)
        sutilities.Debugger.logger_.log("ERROR", location, error, cause, true);
    
}