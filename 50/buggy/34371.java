public static void main(java.lang.String[] args) {
    app.utils.ds.HuffmanTree tree = new app.utils.ds.HuffmanTree();
    java.lang.System.out.println(tree.decompress(tree.compressFromString("jeff_is_awesome")));
}