public void notifyDownloadingVideoChanged(int position, long stepId) {
    org.stepic.droid.model.DownloadingVideoItem item = downloadingVideoList.get(position);
    if (item != null) {
        if ((item.getDownloadEntity().getStepId()) == stepId) {
            notifyItemChanged((position + 1));
        }else {
            notifyDataSetChanged();
        }
    }else {
        notifyDataSetChanged();
    }
}