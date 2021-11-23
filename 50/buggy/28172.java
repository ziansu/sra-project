@java.lang.Override
public void onProgressChanged(android.widget.SeekBar refocusSeekBar, int progress, boolean fromuser) {
    int depth = progress / (com.mediatek.galleryfeature.stereo.refocus.RefocusActivity.PROGRESS_PER_DOF);
    if (depth == 0) {
        depth = 1;
    }
    mDofView.setText(com.mediatek.galleryfeature.stereo.refocus.RefocusActivity.DOFDATA[(depth / 2)]);
}