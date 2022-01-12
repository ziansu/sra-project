public void jobDetails(android.view.View view) {
    if ((currentJob) != null) {
        android.content.Intent intent = new android.content.Intent(this, com.example.phil.httppost.JobView.class);
        intent.putExtra("job", currentJob.getId());
        startActivity(intent);
    }
}