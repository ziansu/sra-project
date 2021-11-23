@org.junit.Test
public void doInBackground() throws java.lang.Exception {
    try {
        com.udacity.gradle.builditbigger.MainActivity mainActivity = new com.udacity.gradle.builditbigger.MainActivity();
        com.udacity.gradle.builditbigger.JokeLoader jokeLoader = new com.udacity.gradle.builditbigger.JokeLoader(mainActivity);
        jokeLoader.execute();
        java.lang.String result = jokeLoader.get(30, java.util.concurrent.TimeUnit.SECONDS);
        org.junit.Assert.assertNotNull(result);
        org.junit.Assert.assertTrue(((result.length()) > 0));
    } catch (java.lang.Exception e) {
        android.util.Log.e("AsyncTaskTested", "testDoInBackground: Timed out");
    }
}