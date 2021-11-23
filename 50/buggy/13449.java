public int countFrontier() {
    int count = 0;
    for (java.util.Map.Entry<java.lang.Integer, java.util.ArrayDeque<client.Node>> nodeList : frontier.entrySet()) {
        count += nodeList.getValue().size();
    }
    return count;
}