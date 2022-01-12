@java.lang.Override
public final java.util.List<com.github.sdnwiselab.sdnwise.flowtable.FlowTableEntry> getNodeRules(final byte net, final com.github.sdnwiselab.sdnwise.util.NodeAddress dst) {
    java.util.List<com.github.sdnwiselab.sdnwise.flowtable.FlowTableEntry> list = new java.util.ArrayList<>();
    com.github.sdnwiselab.sdnwise.flowtable.FlowTableEntry fte;
    int i = 0;
    while ((fte = getNodeRule(net, dst, i)) != null) {
        list.add(i, fte);
        i++;
    } 
    return list;
}