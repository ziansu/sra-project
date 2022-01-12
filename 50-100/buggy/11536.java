public static void fatal(java.lang.String location, java.lang.String error, java.lang.Throwable cause) {
    java.lang.System.err.println(((location + ": ") + error));
    cause.printStackTrace();
    if ((sutilities.Debugger.logger_) != null)
        sutilities.Debugger.logger_.log("SEVERE", location, error, cause, true);
    
}