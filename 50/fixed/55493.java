private void updatePreview(java.text.SimpleDateFormat format) {
    dateFormatPreview.setText(format.format(org.eclipse.egit.ui.internal.preferences.DateFormatPreferencePage.SAMPLE.getWhen()));
}