@java.lang.Override
public T take(java.lang.String category, java.lang.String detail, java.lang.String keyword) {
    if (cluster.SimpleCluster.isDebug()) {
        java.lang.System.err.println(java.lang.String.format("[SimpleCluster] take called. [%s, %s, %s]", category, detail, keyword));
    }
    try {
        T ret = map(cluster.SimpleCluster.getData(category, detail, keyword));
        return ret;
    } catch (java.lang.NullPointerException e) {
        return null;
    }
}