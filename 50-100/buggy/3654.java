public org.biojava.bio.structure.contact.StructureInterfaceList getUniqueInterfaces(double cutoff) {
    org.biojava.bio.structure.contact.StructureInterfaceList set = new org.biojava.bio.structure.contact.StructureInterfaceList();
    if ((structure.getChains().size()) == 0) {
        org.biojava.bio.structure.xtal.CrystalBuilder.logger.warn("No chains present in the structure! No interfaces will be calculated");
        return set;
    }
    initialiseVisited();
    calcInterfacesCrystal(set, cutoff, isCrystallographic);
    return set;
}