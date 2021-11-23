public void deleteAllNode(java.util.ArrayList<java.lang.Character> all) {
    for (java.lang.Character ch : all) {
        if (node.contains(ch)) {
            ch.setPosition(ch.getiniX(), ch.getiniY());
            this.deletenode(ch);
        }
    }
}