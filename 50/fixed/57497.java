public static boolean isChainWaterOnly(org.biojava.nbio.structure.Chain c) {
    for (org.biojava.nbio.structure.Group g : c.getAtomGroups()) {
        if (!(g.isWater()))
            return false;
        
    }
    return true;
}