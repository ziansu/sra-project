private static Pair c_matrix(Node node) {
    Pair result = new Pair(((1 - (node.p)) / (Main.fcost(node))), node.p);
    return result;
}