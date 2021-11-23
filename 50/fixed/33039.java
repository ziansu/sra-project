@java.lang.Override
protected void onPostExecute(java.lang.String json) {
    android.content.Intent intent = new android.content.Intent(this, ljuboandtedi.fridger.activties.ShowMealActivity.class);
    intent.putExtra("json", json);
    startActivity(intent);
}