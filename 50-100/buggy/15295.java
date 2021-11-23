@java.lang.Override
public void onClick(android.view.View v) {
    final int buttonId = v.getId();
    android.util.Log.d(TAG, "START REC");
    recording = true;
    recordFlag = true;
    com.capstone.zacharyverbeck.loopspace.UI.LoopActivity.RecordingTask task = new com.capstone.zacharyverbeck.loopspace.UI.LoopActivity.RecordingTask();
    task.execute(buttonId);
    v.setOnClickListener(stopRecOnClickListener);
}