@java.lang.Override
public void addFailTests() {
    addFailTest(new org.openhealthtools.mdht.uml.cda.mu2consol.tests.FailTest() {
        @java.lang.Override
        public void updateToFail(org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection target) {
        }
    });
    addFailTest(new org.openhealthtools.mdht.uml.cda.mu2consol.tests.FailTest() {
        @java.lang.Override
        public void updateToFail(org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection target) {
            target.init();
        }
    });
}