public double getStandardDeviationMessagesPerNode(double mean) {
    double averageMessagesPerNode = 0.0;
    java.util.Set<java.lang.String> keys = nodeTable.keySet();
    for (java.lang.String key : keys) {
        Node temp = nodeTable.get(key);
        averageMessagesPerNode += java.lang.Math.pow((((temp.getMessagesForwarded()) + (temp.getMessagesReceived())) - mean), 2);
    }
    return java.lang.Math.sqrt((averageMessagesPerNode / (nodeTable.size())));
}