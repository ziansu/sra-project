@org.junit.Test
public void testFixSwtSwtFragmentInRootIUs() throws java.lang.Exception {
    org.eclipse.equinox.p2.metadata.IInstallableUnit rootIU = createSwtFragment("linux", "gtk", "x86_64", null);
    final java.util.List<org.eclipse.equinox.p2.metadata.IInstallableUnit> selectedIUs = createSwtHostBundleIUList();
    invokefixSwtWithLinuxFragmentPresent(rootIU, selectedIUs);
    org.junit.Assert.assertThat(selectedIUs.size(), org.hamcrest.core.Is.is(1));
    org.junit.Assert.assertThat(selectedIUs, org.hamcrest.CoreMatchers.hasItem(org.eclipse.tycho.p2.testutil.InstallableUnitUtil.createIU("org.eclipse.swt", "1.0.0")));
}