private void addMissingBlanks(int index) {
    for (int i = 0; i < ((this.list.size()) - index); i++)
        this.list.add(this.blankElement);
    
}