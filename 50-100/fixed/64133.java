public void augment() {
    java.lang.String l = (this.getProductions().get(0).getLeft()) + "'";
    getNonterminals().add(l);
    l += " :: ";
    l += this.getProductions().get(0).getLeft();
    main.Production p = new main.Production(l);
    getProductions().add(0, p);
}