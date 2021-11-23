public void notifyVideoIDChanged(java.lang.String videoID) {
    if (videoID == null)
        return ;
    
    for (int i = 0, size = list.size(); i < size; i++) {
        org.oneat1.android.model.PlaylistItemResponse.PlaylistItem item = list.get(i);
        if (java.util.Objects.equals(item.getVideoID(), videoID)) {
            notifyItemChanged(i);
            return ;
        }
    }
}