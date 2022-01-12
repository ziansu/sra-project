private void addToOrder(java.lang.String name) {
    this.lOrd.add(new DChar(name));
    if ((this.lOrd.size()) == 0) {
        this.lOrd.get(0).changeTop();
    }
    java.lang.System.out.println(("Added Player: " + name));
}