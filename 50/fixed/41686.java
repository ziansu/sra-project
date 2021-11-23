private static Pair c_matrix(Node node) {
    Pair result = new Pair((((node.p) - 1) / (Main.fcost(node))), node.p);
    return result;
}