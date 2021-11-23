private void broadcastNumSteps() {
    android.content.Intent intent = new android.content.Intent(org.smcnus.irace_gaittester.Service.GaitAnalyzer.MSG_NUM_STEPS);
    intent.putExtra(org.smcnus.irace_gaittester.Service.GaitAnalyzer.MSG_NUM_STEPS, numSteps);
    android.util.Log.d(org.smcnus.irace_gaittester.Service.GaitAnalyzer.TAG, "found a step");
    android.support.v4.content.LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
}