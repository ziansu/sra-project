private void initCBUses() {
    java.util.List usesItems = fh.readFile(paths.getUses());
    for (int i = 0; i < (usesItems.size()); ++i) {
        this.cbUse.addItem(new updated.StringItem((i + 1), ((java.lang.String) (usesItems.get(i)))));
    }
}