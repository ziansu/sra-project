@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.example.inspired.inspiredvideo.app.MovieAdapter videoAdapter = ((com.example.inspired.inspiredvideo.app.MovieAdapter) (mRecyclerView.getAdapter()));
    com.example.inspired.inspiredvideo.activities.Context.setmVideoItemsByGenre(position);
    currentGenre = position;
    favouritesEnabled = false;
    videoAdapter.updatemVideoItems(Context.mCurrentData, favouritesEnabled);
}