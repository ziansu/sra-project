@java.lang.Override
protected void onPostExecute(java.lang.String response) {
    if ((progress) != null) {
        if (progress.equalsIgnoreCase("100")) {
            if (downloadStatusListener.getClass().getSimpleName().equalsIgnoreCase("VideosAdapter")) {
                listItem.setIsDownloading(false);
                viewHolder.thumbnailImage.setClickable(true);
            }else
                if (downloadStatusListener.getClass().getSimpleName().equalsIgnoreCase("ThumbnailListAdapter")) {
                    listItem.setIsDownloading(false);
                }
            
            downloadStatusListener.onDownloadComplete(position);
        }
    }
}