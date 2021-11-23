public void shareText(java.lang.String title, java.lang.String body) {
    android.content.Intent sendIntent = new android.content.Intent(android.content.Intent.ACTION_SEND);
    sendIntent.setType("text/plain");
    sendIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, title);
    sendIntent.putExtra(android.content.Intent.EXTRA_TEXT, body);
    android.content.Intent typechooser = android.content.Intent.createChooser(sendIntent, "Choose sharing method");
    typechooser.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(typechooser);
    BubbleServiceActivity.minimizeBrowser(BubbleServiceActivity.current);
}