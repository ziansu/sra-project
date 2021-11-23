@org.junit.Test
public void testParsingConfigXmlForSettingModulePackageAndId() throws java.lang.Exception {
    org.openmrs.addonindex.scheduled.FetchDetailsToIndex task = new org.openmrs.addonindex.scheduled.FetchDetailsToIndex(null, null);
    org.openmrs.addonindex.domain.AddOnVersion version = new org.openmrs.addonindex.domain.AddOnVersion();
    task.handleConfigXml(org.openmrs.addonindex.TestUtil.getFileAsString("config.withRelativePathDtd.xml"), version);
    org.junit.Assert.assertThat(version.getModulePackage(), org.hamcrest.core.Is.is("org.openmrs.module.mdrtb"));
    org.junit.Assert.assertThat(version.getModuleId(), org.hamcrest.core.Is.is("mdrtb"));
}