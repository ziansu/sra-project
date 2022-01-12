private void browseForFiles() {
    android.content.Intent intent = new android.content.Intent().setType("*/*").putExtra(Intent.EXTRA_ALLOW_MULTIPLE, false).setAction(Intent.ACTION_GET_CONTENT).addCategory(Intent.CATEGORY_OPENABLE);
    startActivityForResult(android.content.Intent.createChooser(intent, getText(R.string.select_file)), ee.ria.EstEIDUtility.fragment.ContainerDetailsFragment.CHOOSE_FILE_REQUEST_ID);
}