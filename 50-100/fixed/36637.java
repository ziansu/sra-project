private void post() {
    android.os.Bundle args = new android.os.Bundle();
    args.putString(NewPostJob.BODY, mBodyText.getText().toString());
    args.putString(NewPostJob.NEWSGROUP_ID, edu.csh.cshwebnews.activities.NewPostActivity.newsgroupId.trim());
    args.putString(NewPostJob.SUBJECT, mSubjectText.getText().toString());
    android.widget.Toast.makeText(this, "Posting...", Toast.LENGTH_SHORT).show();
    edu.csh.cshwebnews.WebNewsApplication.getJobManager().addJobInBackground(new edu.csh.cshwebnews.jobs.NewPostJob(args));
}