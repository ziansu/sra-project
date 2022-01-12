private void makeCodeTable(code.HuffNode huffNode, java.lang.String bc) {
    if ((huffNode.leftChild) != null) {
        bc += "0";
        makeCodeTable(huffNode.leftChild, bc);
    }
    if ((huffNode.rightChild) != null) {
        bc += "1";
        makeCodeTable(huffNode.rightChild, bc);
    }
    if (((huffNode.rightChild) == null) && ((huffNode.rightChild) == null)) {
        char letter = huffNode.character;
        int spot = ((int) (letter));
        codeTable[spot] = bc;
    }
}