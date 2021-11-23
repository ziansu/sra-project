public void tellJoke(android.view.View view) {
    if ((fragment) != null) {
        fragment.onCallFragment();
    }
    progressBar.setVisibility(View.VISIBLE);
    jokesAsyncTask = new com.udacity.gradle.builditbigger.tasks.JokesAsyncTask(this);
    jokesAsyncTask.execute();
}