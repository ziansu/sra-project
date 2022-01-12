public void findShortestPath(Graph g, java.lang.String word1, java.lang.String word2) {
    Node temp1 = DICTIONARY.findWord(word1);
    Node temp2 = DICTIONARY.findWord(word2);
    if (temp1 == null) {
        printErrorNoPath(word1, word2);
        return ;
    }
    java.util.ArrayList<Node> path = searchGraph(g, temp1, temp2);
    SHORTEST_PATH = getShortestPath(path, temp1, temp2);
    printShortestPath();
}