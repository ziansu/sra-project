private java.lang.String buildXrefOrRegionAndConsequenceType(java.util.List<java.lang.String> xrefs, java.util.List<org.opencb.biodata.models.core.Region> regions, java.util.List<java.lang.String> cts) {
    java.lang.String orCts = buildConsequenceTypeOr(cts);
    if (((xrefs.size()) == 0) && ((regions.size()) == 0)) {
        return orCts;
    }else {
        java.lang.String orXrefs = buildXrefOrGeneOrRegion(xrefs, null, regions);
        return ((("(" + orXrefs) + ") AND (") + orCts) + ")";
    }
}