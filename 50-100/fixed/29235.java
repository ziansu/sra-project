@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.example.michelangelowhitten.popmoviesstage1.AndroidMovie pm = imageAdapter.getItem(position);
    android.content.Intent movieIntent = new android.content.Intent(getActivity(), DetailsFragment.DetailActivity.class);
    movieIntent.putExtra(Intent.EXTRA_TEXT, pm);
    startActivity(movieIntent);
}