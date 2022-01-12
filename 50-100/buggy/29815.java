private void initCBUses() {
    java.util.List usesItems = this.fh.readFile(this.paths.getUses());
    for (int i = 0; i < (usesItems.size()); ++i) {
        this.cbUse.addItem(new updated.StringItem((i + 1), ((java.lang.String) (usesItems.get(i)))));
    }
}