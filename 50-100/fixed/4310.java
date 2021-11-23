public static void revertToInitialRSA(com.net2plan.interfaces.networkDesign.Route r) {
    final com.net2plan.libraries.WDMUtils.RSA primaryRSA = new com.net2plan.libraries.WDMUtils.RSA(r, true);
    r.setPath(r.getInitialState().getFirst(), primaryRSA.seqLinks, java.util.Collections.nCopies(primaryRSA.seqLinks.size(), ((double) (primaryRSA.getNumSlots()))));
    com.net2plan.libraries.WDMUtils.setLightpathRSAAttributes(r, primaryRSA, false);
}