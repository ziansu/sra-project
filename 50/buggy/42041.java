@java.lang.Override
protected void onPostExecute(com.presisco.shared.data.EventSummary[] summaries) {
    event_baseline_id += summaries.length;
    startUpload(summaries);
}