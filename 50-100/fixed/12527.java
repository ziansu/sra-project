public void launchFeedbackActivity(android.content.Context context, java.lang.String subject) {
    android.content.Intent emailIntent = new android.content.Intent(android.content.Intent.ACTION_SENDTO, android.net.Uri.fromParts("mailto", Constants.DEV_EMAIL, null));
    emailIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
    emailIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(android.content.Intent.createChooser(emailIntent, context.getString(R.string.select_app)).setFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
}