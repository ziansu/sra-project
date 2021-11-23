private void exec(java.lang.String command) {
    if (!(process.isAlive())) {
        com.danwatling.apkdecompiler.Logger.error("adb process is not alive!");
    }
    try {
        process.getOutputStream().write(command.getBytes());
        process.getOutputStream().write(java.lang.System.lineSeparator().getBytes());
        process.getOutputStream().flush();
    } catch (java.io.IOException ex) {
        com.danwatling.apkdecompiler.Logger.error((("Unable to run '" + command) + "'"), ex);
    }
}