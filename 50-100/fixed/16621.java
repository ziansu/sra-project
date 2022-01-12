static com.aoindustries.lang.ProcessResult execSemanage(java.lang.String... args) throws java.io.IOException {
    java.lang.String[] command = new java.lang.String[1 + (args.length)];
    command[0] = com.aoindustries.selinux.SEManage.SEMANAGE_EXE;
    java.lang.System.arraycopy(args, 0, command, 1, args.length);
    com.aoindustries.lang.ProcessResult result;
    synchronized(com.aoindustries.selinux.SEManage.semanageLock) {
        result = com.aoindustries.lang.ProcessResult.exec(command);
    }
    if ((result.getExitVal()) != 0)
        throw new java.io.IOException(result.getStderr());
    
    return result;
}