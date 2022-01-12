@org.junit.Test
public void testRegionIsFoundWithPolyphenGreaterThan() {
    java.lang.String chr = "11";
    int start = 190000;
    int end = 193719;
    org.opencb.biodata.models.feature.Region region = new org.opencb.biodata.models.feature.Region(chr, start, end);
    java.util.List<org.opencb.biodata.models.feature.Region> regions = new java.util.ArrayList<>();
    regions.add(region);
    java.util.List<uk.ac.ebi.eva.lib.utils.RepositoryFilter> filters = uk.ac.ebi.eva.lib.utils.RepositoryFilter.getRepositoryFilters(null, ">0.5", null, null, null);
    testFiltersHelperRegion(regions, filters, new java.util.ArrayList<>(), 4);
}