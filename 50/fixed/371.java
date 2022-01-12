public void clearSelectedPhotos() {
    for (org.fossasia.phimpme.leafpic.data.Media m : selectedMedias)
        m.setSelected(false);
    
    if ((selectedMedias) != null)
        selectedMedias.clear();
    
    toolbar.setTitle(getString(R.string.all));
}