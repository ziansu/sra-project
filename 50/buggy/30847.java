public static void init() {
    if ((backtype.storm.sharedcontext.ShareContext.root) == null) {
        backtype.storm.sharedcontext.ShareContext.root = new backtype.storm.sharedcontext.ShareContext.Node("/", null);
        backtype.storm.sharedcontext.ShareContext.LOG.info("Share context created.");
    }
}