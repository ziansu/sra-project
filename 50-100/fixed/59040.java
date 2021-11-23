public void onClick(android.view.View v) {
    if ((mColorId) == (com.sharad.epocket.AddCategoryActivity.UNASSIGNED)) {
        mColorPicker.startAnimation(getBlinkAnimation());
    }else
        if ((mIconId) == (com.sharad.epocket.AddCategoryActivity.UNASSIGNED)) {
            mIconPicker.startAnimation(getBlinkAnimation());
        }else {
            onBackPressed();
        }
    
}