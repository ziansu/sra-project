@java.lang.Override
public void onClick(android.view.View v) {
    recordButton.setVisibility(View.VISIBLE);
    stopButton.setVisibility(View.GONE);
    mediaRecorder.stop();
    mediaRecorder.release();
    mediaRecorder = null;
    isRecording[0] = false;
    android.widget.Toast.makeText(getContext(), ((filename[0]) + " is saved to gallery"), Toast.LENGTH_LONG).show();
    audioDialog.dismiss();
}