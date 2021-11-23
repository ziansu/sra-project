@org.junit.Test
public void testVerifyEchoResponse() {
    final com.udacity.gradle.builditbigger.EndpointsAsyncTask endpointsAsyncTask = new com.udacity.gradle.builditbigger.EndpointsAsyncTask();
    com.udacity.gradle.builditbigger.MainActivity mainActivity = rule.getActivity();
    endpointsAsyncTask.execute(mainActivity);
    try {
        java.lang.Thread.sleep(5000);
        java.lang.System.out.println("poraaaaa^^^^^^^^^^^^^^^^^^^^^^^^");
        junit.framework.Assert.assertTrue(((mainActivity.joke.length()) > 0));
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}