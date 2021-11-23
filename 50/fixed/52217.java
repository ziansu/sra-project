@java.lang.Override
public void goToCourseUrl(java.lang.String url) {
    android.content.Intent mainIntent = com.epsilon.screens.main.MainActivity.makeIntent(getActivity(), true, url);
    startActivity(mainIntent);
}