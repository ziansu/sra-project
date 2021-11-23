public void close() {
    try {
        commandWriter.println("exit");
        try {
            p.waitFor();
        } catch (java.lang.InterruptedException ex) {
            java.util.logging.Logger.getLogger(org.profesorfalken.jpowershell.PowerShell.class.getName()).log(java.util.logging.Level.SEVERE, "Unexpected error when processing PowerShell command", ex);
        }
    } finally {
        commandWriter.close();
        if ((this.threadpool) != null) {
            this.threadpool.shutdown();
        }
        this.closed = true;
    }
}