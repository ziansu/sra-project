public org.nextprot.api.core.service.fluent.FluentEntryService.FluentEntry withSrmPeptideMappings() {
    java.lang.System.err.println("Getting srm peptitde");
    java.lang.Long masterId = masterIdentifierService.findIdByUniqueName(entryName);
    entry.setSrmPeptideMappings(peptideMappingService.findSyntheticPeptideMappingByMasterId(masterId));
    return this;
}