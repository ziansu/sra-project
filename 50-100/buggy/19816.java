@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    app.storyteller.testing.MihaiTesting.testingProfile(getApplicationContext());
    app.storyteller.testing.MihaiTesting.testingStory(getApplicationContext());
    if (app.storyteller.LoadingScreen.hasAccount) {
        startActivity(new android.content.Intent(this, app.storyteller.MainActivity.class));
    }else {
        startActivity(new android.content.Intent(this, app.storyteller.SignInActivity.class));
    }
}