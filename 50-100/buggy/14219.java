public static com.peacecorps.pcsa.reporting.ContactOptionsDialogBox newInstance(java.lang.String title, android.app.Activity activity) {
    com.peacecorps.pcsa.reporting.ContactOptionsDialogBox.context = ((android.content.Context) (activity));
    com.peacecorps.pcsa.reporting.ContactOptionsDialogBox customAlertDialogFragment = new com.peacecorps.pcsa.reporting.ContactOptionsDialogBox();
    android.os.Bundle args = new android.os.Bundle();
    args.putString("title", title);
    customAlertDialogFragment.setArguments(args);
    return customAlertDialogFragment;
}