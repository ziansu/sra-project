public void collapseInput(int var) {
    (this.numInputs)--;
    modifyNodeInputIndex(0, (-1));
    modifyNodeInputIndex(1, (-1));
    for (int i = 2; i < (nodes.size()); i++) {
        if ((nodes.get(i).inputIndex) > var)
            modifyNodeInputIndex(i, (-1));
        
    }
}