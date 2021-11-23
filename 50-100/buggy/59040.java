public void onClick(android.view.View v) {
    if ((mColorId) == (com.sharad.epocket.AddCategoryActivity.UNASSIGNED)) {
        mColorPicker.startAnimation(getBlinkAnimation());
        android.widget.Toast.makeText(getBaseContext(), "Select color", Toast.LENGTH_SHORT).show();
    }else
        if ((mIconId) == (com.sharad.epocket.AddCategoryActivity.UNASSIGNED)) {
            mIconPicker.startAnimation(getBlinkAnimation());
            android.widget.Toast.makeText(getBaseContext(), "Select icon", Toast.LENGTH_SHORT).show();
        }else {
            onBackPressed();
        }
    
}