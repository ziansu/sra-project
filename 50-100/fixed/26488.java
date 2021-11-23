private static void waitForServiceRestoration() {
    boolean loop = true;
    while (loop) {
        try {
            java.lang.System.out.println("WARN - Strava temporarily unavailable (503 error) - pausing execution for 60 seconds");
            java.lang.Thread.sleep(60000L);
        } catch (final java.lang.InterruptedException e) {
        }
        try {
            test.utils.TestUtils.strava().getAuthenticatedAthlete();
            loop = false;
        } catch (final javastrava.api.v3.service.exception.StravaServiceUnavailableException e) {
            loop = true;
        }
    } 
}