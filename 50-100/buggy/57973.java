@java.lang.Override
public int run(java.lang.String[] args) throws java.lang.Exception {
    int port;
    try {
        port = java.lang.Integer.parseInt(args[0]);
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(((this.getClass().getName()) + " port"));
        org.apache.hadoop.util.GenericOptionsParser.printGenericCommandUsage(java.lang.System.err);
        return 1;
    }
    start(port);
    while (mRPCServer.isAlive()) {
        java.lang.Thread.sleep(10000L);
    } 
    return 0;
}