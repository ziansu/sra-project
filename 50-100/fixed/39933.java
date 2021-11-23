public void testGetJokeTask() throws java.lang.InterruptedException {
    com.udacity.gradle.builditbigger.EndpointsAsyncTask task = new com.udacity.gradle.builditbigger.EndpointsAsyncTask(getContext());
    task.setListener(new com.udacity.gradle.builditbigger.EndpointsAsyncTask.JokeListener() {
        @java.lang.Override
        public void onJokeReceived(java.lang.String joke) {
            jokeString = joke;
            signal.countDown();
        }
    });
    task.execute(getContext());
    signal.await();
    assertFalse(android.text.TextUtils.isEmpty(jokeString));
}