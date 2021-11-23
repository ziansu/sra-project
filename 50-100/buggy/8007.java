@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.util.Log.i("debug", "I'm here");
    android.content.Intent intent = new android.content.Intent(this, com.example.leo.projet.Activities.MovieActivity.class);
    intent.putExtra("movie", ((java.io.Serializable) (aa.getItem(position))));
    startActivity(intent);
}