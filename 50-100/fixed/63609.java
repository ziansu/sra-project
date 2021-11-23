protected void onPostExecute(java.util.List<eu.nioc.tumblrbrowse.models.BlogElement> localBlogs) {
    if ((exception) != null) {
        android.widget.Toast.makeText(this.activity, activity.getString(R.string.alert_request_blog_error, exception.getMessage()), Toast.LENGTH_SHORT).show();
        localBlogs = null;
    }
    ((eu.nioc.tumblrbrowse.activities.MainActivity) (this.activity)).refreshBlogs(localBlogs);
}