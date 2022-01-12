private void traverse(HuffmanNode n, java.lang.String s) {
    if ((n.getChar()) == ' ') {
        n.setCode(s);
        return ;
    }
    if ((n.getLeft()) != null)
        traverse(n.getLeft(), (s + '0'));
    
    if ((n.getRight()) != null)
        traverse(n.getRight(), (s + '1'));
    
}