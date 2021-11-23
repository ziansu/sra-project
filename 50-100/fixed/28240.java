private void closeShell() {
    try {
        prompt = null;
        if ((pr) != null)
            pr.close();
        
        if ((shellWriter) != null)
            shellWriter.close();
        
        if ((shell) != null) {
            shell.getInputStream().close();
            shell.disconnect();
            shell = null;
        }
    } catch (java.lang.Exception e) {
    }
}