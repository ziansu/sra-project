public void extractTownVillage(java.lang.String addressText, com.rrs.rd.address.interpret.RegionInterpreterVisitor visitor, java.util.Map<java.lang.Long, java.util.List<java.lang.String>> towns) {
    if ((addressText == null) || ((addressText.trim().length()) <= 0))
        return ;
    
    com.rrs.rd.address.persist.AddressEntity addr = new com.rrs.rd.address.persist.AddressEntity(addressText);
    removeSpecialChars(addr);
    extractRegion(addr, visitor);
    extractBrackets(addr);
    removeRedundancy(addr, visitor);
    extractTownVillage(addr, towns);
}