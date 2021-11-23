@java.lang.Override
public void onClick(android.view.View arg0) {
    {
        mAdIndex = (((mAdIndex) + (mVideoFilesVector.size())) - 1) % (mVideoFilesVector.size());
        java.lang.String filePath = ((java.lang.String) (mVideoFilesVector.get(mAdIndex)));
        mVideoView.setVideoURI(android.net.Uri.parse(filePath));
        mVideoView.start();
    }
}