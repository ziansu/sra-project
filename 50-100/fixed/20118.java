@java.lang.Override
public void OnTaskFinish(java.util.List<ru.itis.marvel_encyclopedia.POJO.Result> characters) {
    getAsyncFragment().stopAsync();
    android.content.Intent intent = new android.content.Intent(this, ru.itis.marvel_encyclopedia.activities.ListActivity.class);
    intent.putExtra("characters", ((java.io.Serializable) (characters)));
    startActivity(intent);
    finish();
}