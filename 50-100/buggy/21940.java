@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.book_detail_menu_delete :
            com.smartjinyu.mybookshelf.BookLab.get(this).deleteBook(mBook);
            android.widget.Toast.makeText(this, R.string.book_detail_book_delete_toast, Toast.LENGTH_LONG).show();
            finish();
            break;
        default :
            break;
    }
    return true;
}