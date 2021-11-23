public void addAllNode(java.util.ArrayList<java.lang.Character> all) {
    for (java.lang.Character ch : all) {
        if ((node.contains(ch)) == false)
            this.addNode(ch);
        
    }
    this.changePosition();
}