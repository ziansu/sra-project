@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    android.widget.Toast.makeText(context, result, Toast.LENGTH_LONG).show();
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.taehun.jokesactivity.JokesActivity.class);
    intent.putExtra(JokesActivity.JOKE_KEY, result);
    startActivity(intent);
}