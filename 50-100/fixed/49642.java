@org.junit.Test
public void testParsingConfigXmlForRequiredOpenmrsVersion() throws java.lang.Exception {
    org.openmrs.addonindex.scheduled.FetchDetailsToIndex task = new org.openmrs.addonindex.scheduled.FetchDetailsToIndex(null, null);
    org.openmrs.addonindex.domain.AddOnVersion version = new org.openmrs.addonindex.domain.AddOnVersion();
    org.openmrs.addonindex.domain.AddOnInfoAndVersions addOnInfoAndVersions = new org.openmrs.addonindex.domain.AddOnInfoAndVersions();
    task.handleConfigXml(org.openmrs.addonindex.TestUtil.getFileAsString("config.withRequiredVersion.xml"), version);
    org.junit.Assert.assertThat(version.getRequireOpenmrsVersion(), org.hamcrest.core.Is.is("1.11.3, 1.10.2 - 1.10.*, 1.9.9 - 1.9.*"));
    org.junit.Assert.assertThat(version.getRequireModules(), org.hamcrest.core.IsNull.nullValue());
}