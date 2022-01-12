private void checkPreview() {
    if (android.provider.Settings.canDrawOverlays(this))
        preview.setChecked(true);
    else
        preview.setChecked(false);
    
    preview.setOnTouchListener(this);
}