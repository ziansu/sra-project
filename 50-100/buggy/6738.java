@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.m_add_sample_data :
            addSampleData();
            displayData();
            return true;
        case R.id.m_add_book :
            android.content.Intent intent = new android.content.Intent(this, divyanshu.bookinventory.AddBookActivity.class);
            startActivity(intent);
            return true;
        case R.id.m_delete_all_data :
            deleteAllData();
            displayData();
    }
    return super.onOptionsItemSelected(item);
}