public int compare(java.util.Map.Entry<org.ethereum.net.rlpx.discover.Node, org.ethereum.net.rlpx.discover.NodeStatistics.Persistent> o1, java.util.Map.Entry<org.ethereum.net.rlpx.discover.Node, org.ethereum.net.rlpx.discover.NodeStatistics.Persistent> o2) {
    return (o1.getValue().reputation) - (o2.getValue().reputation);
}