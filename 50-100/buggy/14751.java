@java.lang.Override
public void destroy() {
    try {
        final net.bpiwowar.xpm.connectors.AbstractProcessBuilder builder = getConnector().processBuilder();
        builder.command("oardel", "--signal", "TERM", pid);
        builder.detach(false);
        builder.execute();
    } catch (java.lang.Exception e) {
        throw new net.bpiwowar.xpm.exceptions.WrappedException(e);
    }
}