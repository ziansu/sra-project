@android.support.annotation.NonNull
public android.content.Intent getFeedbackEmailIntent(@android.support.annotation.NonNull
final java.lang.String[] emailAddresses, @android.support.annotation.NonNull
final java.lang.String emailSubjectLine, @android.support.annotation.NonNull
final android.net.Uri screenshotUri) {
    final android.content.Intent emailIntent = getBaseFeedbackEmailIntent(emailAddresses, emailSubjectLine);
    emailIntent.putExtra(Intent.EXTRA_STREAM, screenshotUri);
    emailIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
    return emailIntent;
}