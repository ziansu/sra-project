public void applyFilter(java.lang.String filter) {
    components.clear();
    if ((filter.length()) > 0) {
        for (net.yawk.client.gui.components.selectors.SelectorButton selectorButton : componentsPool) {
            if (selectorButton.getStaticText().contains(filter)) {
                components.add(selectorButton);
            }
        }
    }else {
        components.addAll(componentsPool);
    }
}