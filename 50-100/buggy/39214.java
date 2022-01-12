private static backtype.storm.sharedcontext.ShareContext.Node findNode(java.lang.String path, boolean force) throws java.lang.Exception {
    backtype.storm.sharedcontext.ShareContext.Node e = backtype.storm.sharedcontext.ShareContext.root;
    java.lang.String[] tokens = path.split("/");
    for (java.lang.String token : tokens) {
        if (token.isEmpty()) {
            continue;
        }
        if (!(e.children.containsKey(token))) {
            if (force) {
                return null;
            }else {
                throw new sun.dc.path.PathException("path not exist!");
            }
        }
        e = e.children.get(token);
    }
    return e;
}