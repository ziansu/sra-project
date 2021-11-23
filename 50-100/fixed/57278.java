private void openLocationDialog() {
    org.eclipse.swt.widgets.DirectoryDialog dialog = new org.eclipse.swt.widgets.DirectoryDialog(getShell());
    dialog.setText(com.google.cloud.tools.eclipse.appengine.newproject.maven.Messages.getString("GENERATED_PROJECT_LOCATION"));
    java.lang.String location = dialog.open();
    if (location != null) {
        locationField.setText(location);
        checkFlipToNext();
    }
}