@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    jokeString = s;
    hideProgressBar();
    if ((context) != null) {
        startJokeDisplayActivity();
    }
}