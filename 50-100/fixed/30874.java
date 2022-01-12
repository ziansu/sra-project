private void postInsert(java.lang.Boolean result) {
    if (result) {
        fabProgressCircle.beginFinalAnimation();
        setTitle(dishNameEditText.getText().toString().trim());
        setEditMode(false);
    }else {
        fabProgressCircle.beginFinalAnimation();
    }
}