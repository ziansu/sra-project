private void insertRemainingWord(algorithms.tst.intern.TstNode node, java.lang.String string) {
    while ((string.length()) > 0) {
        node.setCharacter(string.charAt(0));
        string = string.substring(1);
        if ((string.length()) > 0) {
            node.setMiddleChild(new algorithms.tst.intern.TstNode());
            node = node.getMiddleChild();
        }
    } 
}