@java.lang.Override
public void onSearch(java.lang.String searchTerm) {
    android.widget.Toast.makeText(this, (searchTerm + " Searched"), Toast.LENGTH_LONG).show();
    toolbar.setTitle(searchTerm);
    getWeekPager(searchTerm);
}