@java.lang.Override
public void onClick(android.view.View v) {
    if (((actionType) == 3) || (testing)) {
        pathLength = ((float) (ballView.getTotalPathLength()));
        metric = ((pathLength) + (timeSpentInCircle)) + (trialDuration);
        android.content.Intent intent = getIntent();
        intent.putExtra("score", metric);
        setResult(edu.umd.cmsc436.Level.RESULT_OK, intent);
        sendToSheets();
    }else {
        finish();
    }
}