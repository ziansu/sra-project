private android.content.Intent createShareTips() {
    java.lang.String send = java.lang.String.valueOf(array[counter]);
    android.content.Intent shareIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    shareIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET);
    shareIntent.setType("text/plain");
    shareIntent.putExtra(Intent.EXTRA_TEXT, ((words.getText()) + (com.app.cryptotunnel.nutriplan.HealthTips.APP_SHARE_HASHTAG)));
    return shareIntent;
}