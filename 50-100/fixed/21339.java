private void makeCodeTable(code.HuffNode huffNode) {
    if ((huffNode.leftChild) != null) {
        bc += "0";
        makeCodeTable(huffNode.leftChild);
    }
    if ((huffNode.rightChild) != null) {
        bc += "1";
        makeCodeTable(huffNode.rightChild);
    }
    if (((huffNode.rightChild) == null) && ((huffNode.rightChild) == null)) {
        char letter = huffNode.character;
        int spot = ((int) (letter));
        codeTable[spot] = bc;
    }
}