@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int sel = item.getItemId();
    if ((sel == (R.id.menu_books_tags)) && ((author_id) > 0)) {
        android.content.Intent intent = new android.content.Intent(this, monakhv.android.samlib.AuthorTagsActivity.class);
        intent.putExtra(AuthorTagsActivity.AUTHOR_ID, author_id);
        startActivityForResult(intent, monakhv.android.samlib.BooksActivity.TAGS_ACTIVITY);
    }
    if (sel == (R.id.menu_books_sort)) {
        listFragment.selectSortOrder();
    }
    return super.onOptionsItemSelected(item);
}