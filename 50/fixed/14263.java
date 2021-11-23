public void notifyModelChanged(java.lang.Object model) {
    int pos = mModels.indexOf(model);
    if (pos >= 0) {
        notifyItemChanged(pos);
    }
}