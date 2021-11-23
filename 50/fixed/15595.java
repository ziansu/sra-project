@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case android.R.id.home :
            getActivity().onBackPressed();
        default :
            return super.onOptionsItemSelected(item);
    }
}