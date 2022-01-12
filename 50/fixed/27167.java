public int compare(java.util.Map.Entry<org.ethereum.net.rlpx.discover.Node, org.ethereum.net.rlpx.discover.NodeStatistics.Persistent> o1, java.util.Map.Entry<org.ethereum.net.rlpx.discover.Node, org.ethereum.net.rlpx.discover.NodeStatistics.Persistent> o2) {
    return (o2.getValue().reputation) - (o1.getValue().reputation);
}