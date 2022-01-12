public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.deleteStudentItem :
            int id = student.getId();
            db.delete(id);
            finish();
            return true;
    }
    return super.onOptionsItemSelected(item);
}