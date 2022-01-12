public void disconnectAndAdd(ListNode2 node, java.lang.String newStr) {
    WordLoc wloc = ((WordLoc) (node.getValue()));
    java.lang.String sentence = ((java.lang.String) (wloc.getSentenceNode().getValue()));
    if (!(sentence.equals(newStr))) {
        wloc.getSentenceNode().setValue(newStr);
        disconnect(sentence);
        addSentenceWords(newStr);
    }
}