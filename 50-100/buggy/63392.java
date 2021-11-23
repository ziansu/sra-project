public static void main(java.lang.String[] args) throws java.io.IOException {
    java.util.Map<java.lang.Short, java.lang.Integer> huff = new java.util.HashMap<java.lang.Short, java.lang.Integer>();
    java.lang.String infile = "src/plaintext.txt";
    java.lang.String outfile = "src/encoded.grin";
    BitInputStream input = new BitInputStream(infile);
    BitOutputStream output = new BitOutputStream(outfile);
    HuffmanTree.addAllChars(huff, input);
    HuffmanTree htree = new HuffmanTree(huff);
    htree.encode(input, output);
}