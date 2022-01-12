public static void shareFileIntent(android.app.Activity activity, java.lang.String data, java.lang.String title, java.io.File attached) {
    ShareCompat.IntentBuilder.from(activity).setType("text/plain").addEmailTo("").setSubject(title).setStream(android.support.v4.content.FileProvider.getUriForFile(activity, ((org.eyeseetea.malariacare.BuildConfig.APPLICATION_ID) + ".data.database.utils.ExportData"), attached)).setText(data).startChooser();
}