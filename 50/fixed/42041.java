@java.lang.Override
protected void onPostExecute(com.presisco.shared.data.EventSummary[] summaries) {
    if ((summaries.length) > 0) {
        event_baseline_id += summaries.length;
        startUpload(summaries);
    }
}