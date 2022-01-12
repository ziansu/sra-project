public void sendEmailMessage(java.lang.String body) {
    android.content.Intent mailIntent = new android.content.Intent();
    mailIntent.setAction(Intent.ACTION_SEND);
    mailIntent.setType("message/rfc822");
    mailIntent.putExtra(Intent.EXTRA_EMAIL, new java.lang.String[]{ "" });
    mailIntent.putExtra(Intent.EXTRA_SUBJECT, "AppExtract for Android");
    mailIntent.putExtra(Intent.EXTRA_TEXT, body);
    startActivity(android.content.Intent.createChooser(mailIntent, "Please choose your email app:"));
}