public static boolean killProcessTree(@org.jetbrains.annotations.NotNull
java.lang.Process process) {
    if (com.intellij.openapi.util.SystemInfo.isWindows) {
        try {
            if (com.intellij.openapi.util.registry.Registry.is("disable.winp")) {
                com.intellij.execution.process.WinProcessManager.kill(process, true);
            }else {
                com.intellij.execution.process.OSProcessUtil.createWinProcess(process).killRecursively();
            }
            return true;
        } catch (java.lang.Throwable e) {
            com.intellij.execution.process.OSProcessUtil.LOG.info("Cannot kill process tree", e);
        }
    }else
        if (com.intellij.openapi.util.SystemInfo.isUnix) {
            return com.intellij.execution.process.UnixProcessManager.sendSigKillToProcessTree(process);
        }
    
    return false;
}