public void navigateToFrontPage() {
    com.campustribune.event.utility.EventRestCallThread myRestClient = new com.campustribune.event.utility.EventRestCallThread(getApplicationContext(), new java.lang.String("create"), event, this.token);
    myRestClient.start();
    android.content.Intent frontPageIntent = new android.content.Intent(this, com.campustribune.frontpage2.FrontPageActivity.class);
    frontPageIntent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
    this.startActivity(frontPageIntent);
    this.finish();
}