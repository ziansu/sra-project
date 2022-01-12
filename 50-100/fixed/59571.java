public void testJokeDownload() {
    com.udacity.gradle.builditbigger.AsyncTaskJokes endpointsAsyncTask = new com.udacity.gradle.builditbigger.AsyncTaskJokes(getContext(), true);
    com.udacity.gradle.builditbigger.MainActivityFragment fragment = new com.udacity.gradle.builditbigger.MainActivityFragment();
    endpointsAsyncTask.execute(fragment);
    try {
        endpointsAsyncTask.get();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    org.junit.Assert.assertThat(fragment.mResult, org.hamcrest.Matchers.notNullValue());
    assertTrue(((fragment.mResult.length()) > 0));
}