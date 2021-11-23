public void addAllWords() {
    ListNode2 node = sentencesHead;
    while (node != null) {
        addSentenceWords(((java.lang.String) (node.getValue())));
        node = node.getNext();
    } 
}