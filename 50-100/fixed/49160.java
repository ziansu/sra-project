@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.search :
            onSearchRequested();
            return true;
        case R.id.grid_toggle :
            adapter.isImage = !(adapter.isImage);
            isGrid = !(isGrid);
            recyclerView.setLayoutManager((isGrid ? new android.support.v7.widget.GridLayoutManager(this, 3) : new android.support.v7.widget.LinearLayoutManager(this)));
            adapter.notifyDataSetChanged();
            return true;
        case R.id.favorites :
            startActivity(new android.content.Intent(this, com.xfinity.simpsonsviewer.FavoriteCharacterListActivity.class));
        default :
            return false;
    }
}