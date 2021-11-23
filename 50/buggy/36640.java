private void backToFlActivity() {
    android.content.Intent intent;
    intent = new android.content.Intent(this, org.redPanda.ChannelList.FlActivity.class);
    intent.addFlags(((android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP) | (android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP)));
    startActivity(intent);
}