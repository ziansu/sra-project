private void postInsert(java.lang.Boolean result) {
    if (result) {
        fabProgressCircle.beginFinalAnimation();
        setTitle(dishNameEditText.getText().toString().trim());
        android.support.design.widget.Snackbar.make(rootLayout, "Failed", Snackbar.LENGTH_LONG).show();
        setEditMode(false);
    }else {
        fabProgressCircle.beginFinalAnimation();
        android.support.design.widget.Snackbar.make(rootLayout, "Failed", Snackbar.LENGTH_LONG).show();
    }
}