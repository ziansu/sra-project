public void applyFilter(java.lang.String filter) {
    filter = filter.toLowerCase();
    components.clear();
    if ((filter.length()) > 0) {
        for (net.yawk.client.gui.components.selectors.SelectorButton selectorButton : componentsPool) {
            if (selectorButton.getStaticText().toLowerCase().contains(filter)) {
                components.add(selectorButton);
            }
        }
    }else {
        components.addAll(componentsPool);
    }
}