public void addAllNode(java.util.ArrayList<java.lang.Character> all) {
    for (java.lang.Character ch : all) {
        this.addNode(ch);
    }
    this.changePosition();
}