public void onClick(android.view.View v) {
    if (isReplyable) {
        android.content.Intent intent = new android.content.Intent(this, moe.minori.pgpclipper.PGPClipperQuickReplyActivity.class);
        intent.putExtra("KEY_ID", convertToStringArray(moe.minori.pgpclipper.PGPClipperResultShowActivity.KEY_ID));
        startActivity(intent);
        overridePendingTransition(0, 0);
        finish();
    }
}