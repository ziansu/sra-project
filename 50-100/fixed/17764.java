public void exportToCollect(int requestCode) {
    android.content.Intent createInstanceIntent = new android.content.Intent(getApplication(), org.opendatakit.scan.android.JSON2XForm.class);
    createInstanceIntent.putExtras(extras);
    createInstanceIntent.putExtra("templatePath", templatePath);
    createInstanceIntent.putExtra("photoName", photoName);
    startActivityForResult(createInstanceIntent, requestCode);
}