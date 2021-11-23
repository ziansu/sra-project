@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    android.util.Log.e(com.udacity.gradle.builditbigger.EndpointsAsyncTask.class.getSimpleName(), ("" + result));
    if ((mProgressBar) != null) {
        mProgressBar.setVisibility(View.GONE);
    }
    android.content.Intent intent = new android.content.Intent(mContext, com.example.androidjokelibrary.JokeDisplayIntent.class);
    intent.putExtra(JokeDisplayIntent.JOKE_TAG, result);
    mContext.startActivity(intent);
}