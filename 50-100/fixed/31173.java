@org.junit.Test
public void testFixSwtSwtInRootIUs() throws java.lang.Exception {
    org.eclipse.equinox.p2.metadata.IInstallableUnit rootIU = org.eclipse.tycho.p2.testutil.InstallableUnitUtil.createIU("org.eclipse.swt", "1.0.0");
    selectedIUs.add(org.eclipse.tycho.p2.testutil.InstallableUnitUtil.createIU("org.eclipse.swt", "1.0.0"));
    invokefixSwtWithLinuxFragmentPresent(rootIU, selectedIUs);
    org.junit.Assert.assertThat(selectedIUs.size(), org.hamcrest.core.Is.is(1));
    org.junit.Assert.assertThat(selectedIUs, org.hamcrest.CoreMatchers.hasItem(org.eclipse.tycho.p2.testutil.InstallableUnitUtil.createIU("org.eclipse.swt", "1.0.0")));
}