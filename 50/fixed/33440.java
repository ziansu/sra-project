@java.lang.Override
public void progressUpdate(final int progress) {
    if ((mProgressListener) == null)
        return ;
    
    mHandler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mProgressListener.onProgressUpdate(progress);
        }
    });
}