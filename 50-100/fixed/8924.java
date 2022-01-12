public void verifyEndpointResponseNotEmpty() {
    try {
        java.lang.String string = new com.abhelly.builditbigger.EndpointsAsyncTask(getContext(), null).execute().get();
        assertNotNull(string);
        assertTrue(((string.length()) > 0));
    } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
        e.printStackTrace();
    }
}