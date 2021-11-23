@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    if (result != null) {
        WelcomeText.setText(("Read content: " + result));
        com.example.ckinn.honoursproject.HomeScreenActivity.readingCard = false;
    }else {
        WelcomeText.setText("Tag was empty, but still read");
    }
}