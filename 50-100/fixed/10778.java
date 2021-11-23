@java.lang.Override
public void run() {
    com.vessel.VesselAB.setABListener(new com.vessel.interfaces.ABListener() {
        @java.lang.Override
        public void testNotAvailable(final com.vessel.enums.VesselEnums.TestVariation testVariation) {
            callbackContext.success(testVariation.toString());
        }

        @java.lang.Override
        public void testLoading() {
        }

        @java.lang.Override
        public void testLoaded(java.lang.String testName, final com.vessel.enums.VesselEnums.TestVariation testVariation) {
            callbackContext.success(testVariation.toString());
        }
    });
}