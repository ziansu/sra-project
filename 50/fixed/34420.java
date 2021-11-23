public void run() {
    try {
        exec(fcommand);
    } catch (java.lang.Exception e) {
        it.cloud.utils.Ssh.logger.error("Error while executing the command.", e);
    }
}