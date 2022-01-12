@org.junit.Test
public void testParsingWithDoctypeRelativePath() throws java.lang.Exception {
    org.openmrs.addonindex.scheduled.FetchDetailsToIndex task = new org.openmrs.addonindex.scheduled.FetchDetailsToIndex(null, null);
    org.openmrs.addonindex.domain.AddOnVersion version = new org.openmrs.addonindex.domain.AddOnVersion();
    org.openmrs.addonindex.domain.AddOnInfoAndVersions addOnInfoAndVersions = new org.openmrs.addonindex.domain.AddOnInfoAndVersions();
    task.handleConfigXml(org.openmrs.addonindex.TestUtil.getFileAsString("config.withRelativePathDtd.xml"), version, addOnInfoAndVersions, true);
}