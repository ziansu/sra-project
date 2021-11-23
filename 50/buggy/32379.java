private void setLoggedIn(boolean loggedIn) {
    if (loggedIn) {
        android.content.Intent in = new android.content.Intent(this, com.activity.nikhilesh.dropphoto.PictureActivity.class);
        in.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(in);
        finish();
    }
}