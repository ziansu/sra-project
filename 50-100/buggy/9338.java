@java.lang.Override
public int compareTo(org.sosy_lab.cpachecker.pcc.strategy.partitioning.BestFirstWeightedBalancedGraphPartitioner.NodePriority compNode) {
    if (compNode == null) {
        return -1;
    }
    if ((this.getPriority()) == (compNode.getPriority())) {
        return (this.getPriority()) - (compNode.getPriority());
    }else {
        int n1 = this.getNode().getNodeNumber();
        int n2 = compNode.getNode().getNodeNumber();
        return n2 - n1;
    }
}