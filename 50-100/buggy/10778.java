@java.lang.Override
public void run() {
    com.vessel.VesselAB.setABListener(new com.vessel.interfaces.ABListener() {
        @java.lang.Override
        public void testNotAvailable(com.vessel.enums.VesselEnums.TestVariation arg0) {
            callbackContext.success(arg0.toString());
        }

        @java.lang.Override
        public void testLoading() {
        }

        @java.lang.Override
        public void testLoaded(java.lang.String testName, com.vessel.enums.VesselEnums.TestVariation testVariation) {
            callbackContext.success(testVariation.toString());
        }
    });
}