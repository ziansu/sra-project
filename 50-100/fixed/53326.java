@org.junit.Test
public void testCondomKitSetup() {
    com.oasisfeng.condom.CondomProcessTest.runInSeparateProcess(new com.oasisfeng.condom.TestService.Procedure() {
        @java.lang.Override
        public void run(final android.content.Context context) {
            try {
                com.oasisfeng.condom.CondomProcessTest.installCondomProcess(context, new com.oasisfeng.condom.CondomOptions().addKit(new com.oasisfeng.condom.kit.NullDeviceIdKit()));
                org.junit.Assert.fail("CondomKit is incompatible with CondomProcess");
            } catch (final java.lang.IllegalArgumentException ignored) {
            }
        }
    });
}