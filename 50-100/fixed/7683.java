@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.sort_by :
            java.lang.String[] items = getResources().getStringArray(R.array.sort_by);
            com.psincraian.gameslibrary.SortByDialog dialog = new com.psincraian.gameslibrary.SortByDialog(getActivity(), items, this);
            dialog.onCreateDialog(null).show();
            break;
    }
    return super.onOptionsItemSelected(item);
}