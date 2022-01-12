@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.batch_add_menu_item_save :
            if ((com.smartjinyu.mybookshelf.BatchAddActivity.mBooks.size()) != 0) {
                chooseBookshelf();
            }else {
                finish();
            }
        default :
            return super.onOptionsItemSelected(item);
    }
}