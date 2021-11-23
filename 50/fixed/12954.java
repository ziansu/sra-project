public void remove(com.achanr.glovercolorapp.models.GCSavedSet savedSet) {
    int position = mSavedSetList.indexOf(savedSet);
    if (position >= 0) {
        mSavedSetList.remove(position);
        notifyItemRemoved(position);
    }
}