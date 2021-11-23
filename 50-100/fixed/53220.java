private static java.util.List<java.lang.String> getColorsForChains(java.util.List<java.lang.String> chains) {
    java.util.List<java.lang.String> colors = new java.util.ArrayList<>();
    for (java.lang.String chain : chains) {
        colors.add(eppic.MolViewersHelper.getHexChainColor(chain, true));
    }
    return colors;
}