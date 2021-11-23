public void notifyVideoIDChanged(java.lang.String videoID) {
    if (videoID == null)
        return ;
    
    for (int i = 0, size = list.size(); i < size; i++) {
        if (java.util.Objects.equals(list.get(i).getVideoID(), videoID)) {
            notifyItemChanged(i);
            return ;
        }
    }
}