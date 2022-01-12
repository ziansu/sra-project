protected void resumeFeedbackAndGraph() {
    android.util.Log.d("GRAPH_LIFE", "RESUME_GRAPH");
    if ((graphFragment) != null) {
        graphFragment.resumeReceivingData();
    }
    if ((feedback) != null) {
        feedback.resumeRecievingData();
    }
}