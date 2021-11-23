@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    client = com.codepath.apps.mysimpletweets.TwitterApplication.getRestClient();
    populateTimeline(0);
}