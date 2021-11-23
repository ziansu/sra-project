public void replace(int position, java.lang.Object content) {
    if (position > (nodes))
        return ;
    
    Node replace = start;
    for (int i = 0; i < (position - 1); i++) {
        replace = replace.getNextNode();
    }
    replace.setContent(content);
}