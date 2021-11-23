@java.lang.Override
public final java.util.List<com.github.sdnwiselab.sdnwise.util.NodeAddress> getNodeAliases(final byte net, final com.github.sdnwiselab.sdnwise.util.NodeAddress dst) {
    java.util.List<com.github.sdnwiselab.sdnwise.util.NodeAddress> list = new java.util.LinkedList<>();
    com.github.sdnwiselab.sdnwise.util.NodeAddress na;
    int i = 0;
    while ((na = getNodeAlias(net, dst, ((byte) (i)))) != null) {
        i++;
        list.add(i, na);
    } 
    return list;
}