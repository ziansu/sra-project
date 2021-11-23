private void setTitle() {
    java.lang.String title = null;
    if ((currentStory) != null) {
        title = "#" + (currentStory.storyNum);
    }
    ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().setTitle(title);
}