private void uploadNextPost() {
    synchronized(org.wordpress.android.ui.posts.PostUploadService.mPostsList) {
        if ((mCurrentTask) == null) {
            org.wordpress.android.ui.posts.PostUploadService.mCurrentUploadingPost = null;
            if ((org.wordpress.android.ui.posts.PostUploadService.mPostsList.size()) > 0) {
                org.wordpress.android.ui.posts.PostUploadService.mCurrentUploadingPost = org.wordpress.android.ui.posts.PostUploadService.mPostsList.remove(0);
                mCurrentTask = new org.wordpress.android.ui.posts.PostUploadService.UploadPostTask();
                mCurrentTask.execute(org.wordpress.android.ui.posts.PostUploadService.mCurrentUploadingPost);
            }else {
                this.stopSelf();
            }
        }
    }
}