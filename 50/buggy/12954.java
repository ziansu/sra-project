public void remove(com.achanr.glovercolorapp.models.GCSavedSet savedSet) {
    int position = mSavedSetList.indexOf(savedSet);
    mSavedSetList.remove(position);
    notifyItemRemoved(position);
}