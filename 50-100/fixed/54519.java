@org.junit.Test
public void mountAndUnmountTestContainerWindows() throws java.io.IOException, java.lang.InterruptedException {
    org.junit.Assume.assumeTrue(SystemUtils.IS_OS_WINDOWS);
    java.io.File tcTestFile = new java.io.File("src/test/resources/tests/TestTCVol1.tc");
    java.lang.String drive = org.backmeup.index.core.truecrypt.TCMountHandler.mount(tcTestFile, "12345", "J");
    org.junit.Assert.assertEquals("TrueCrypt Testvolume did not get mounted", true, org.backmeup.index.core.truecrypt.TCMountHandler.isDriveMounted(drive));
    org.backmeup.index.core.truecrypt.TCMountHandler.unmount(drive);
    org.junit.Assert.assertEquals("TrueCrypt Testvolume did not get unmounted properly", false, org.backmeup.index.core.truecrypt.TCMountHandler.isDriveMounted(drive));
}