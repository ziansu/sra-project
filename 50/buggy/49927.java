@java.lang.Override
protected void onResume() {
    super.onResume();
    pView.addPuzzleViewListener(this);
    loadPreferences();
    if (pView.getImageSourceType().equals(PuzzleView.IMAGESOURCETYPE_UNDEFINED))
        pView.setImageWallpaper(defaultPuzzleSize);
    
}