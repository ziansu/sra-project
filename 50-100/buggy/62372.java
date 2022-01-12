public void clear(android.view.View view) {
    java.lang.String text = ((android.widget.EditText) (findViewById(R.id.inputCourseET))).getText().toString();
    if (text.equalsIgnoreCase("")) {
        getContentResolver().delete(me.shalvah.dbtest.TestSimpleContentProvider.contentUri("courses"), null, null);
    }else {
        getContentResolver().delete(me.shalvah.dbtest.TestSimpleContentProvider.contentUri((((TestSimpleContentProvider.TABLE_COURSES) + "/") + text)), null, null);
    }
}