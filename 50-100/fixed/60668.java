private boolean exec(java.lang.String command) {
    if (!(process.isAlive())) {
        return false;
    }
    try {
        process.getOutputStream().write(command.getBytes());
        process.getOutputStream().write(java.lang.System.lineSeparator().getBytes());
        process.getOutputStream().flush();
    } catch (java.io.IOException ex) {
        com.danwatling.apkdecompiler.Logger.error((("Unable to run '" + command) + "'"), ex);
    }
    return true;
}