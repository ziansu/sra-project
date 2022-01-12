@java.lang.Override
public void onDetach() {
    super.onDetach();
    mRecorder.stop();
    mRecorder.reset();
    mRecorder.release();
    mRecorder = null;
    btnRecord.releaseRecorder();
    com.legitdevs.legitnotes.AudioWife.getInstance().release();
    awContainer.removeAllViewsInLayout();
    recording = false;
}