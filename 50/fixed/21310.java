private void sendSchedule(edu.gatech.ledpathways.androidemployeeapp.objects.Schedule schedule, android.app.ProgressDialog p) {
    edu.gatech.ledpathways.androidemployeeapp.http.AsyncSendTimes post = new edu.gatech.ledpathways.androidemployeeapp.http.AsyncSendTimes(schedule, p, this);
    post.execute();
}