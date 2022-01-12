public boolean updateTagState(prada.lab.android.pingo.model.Tag tag, boolean selected) {
    int idx = findTagPosition(tag);
    if (idx < 0) {
        return false;
    }
    tags.get(idx).getTag().setSelected(selected);
    return true;
}