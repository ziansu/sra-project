protected org.sapia.corus.interop.client.BaseFileLogOutput.FileWriter createFileWriter(java.io.File target) {
    try {
        java.io.PrintWriter stream = new org.sapia.corus.interop.client.TimestampPrintWriter(new java.io.FileOutputStream(target));
        return new org.sapia.corus.interop.client.BaseFileLogOutput.StreamFileWriter(stream);
    } catch (java.io.FileNotFoundException e) {
        java.lang.System.out.println("Could not create log file, will log to DEV/NULL");
        e.printStackTrace();
        return new org.sapia.corus.interop.client.BaseFileLogOutput.NullFileWriter();
    }
}