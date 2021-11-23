@java.lang.Override
public void onSearch(java.lang.String searchTerm) {
    toolbar.setTitle(searchTerm);
    getWeekPager(searchTerm);
}