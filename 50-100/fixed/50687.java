public void setVid(final java.lang.String vid) {
    if (android.text.TextUtils.isEmpty(vid))
        return ;
    
    post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            video.release();
            controller.hide();
            progress.setVisibility(View.GONE);
            video.setVid(vid);
        }
    });
}