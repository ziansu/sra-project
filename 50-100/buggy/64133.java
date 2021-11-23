public void augment() {
    java.lang.String l = (this.getProductions().get(0).getLeft()) + "'";
    this.getNonterminals().add(l);
    l += " :: ";
    l += this.getProductions().get(0).getLeft();
    main.Production p = new main.Production(l);
    this.getProductions().add(0, p);
}