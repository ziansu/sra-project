@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.content.Intent intent = new android.content.Intent(getActivity(), hummingbird.android.mobile_app.views.activities.AnimeActivity.class);
    hummingbird.android.mobile_app.models.LibraryEntry entry = ((hummingbird.android.mobile_app.models.LibraryEntry) (list_view.getItemAtPosition(position)));
    intent.putExtra("LibraryEntry", entry);
    intent.putExtra("id", entry.anime.id);
    intent.putExtra("isLibraryEntry", true);
    startActivity(intent);
}