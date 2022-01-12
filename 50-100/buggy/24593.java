@java.lang.Override
public boolean onContextItemSelected(android.view.MenuItem item) {
    java.lang.String environment = "";
    switch (item.getItemId()) {
        case R.id.upload_item_image_or_video :
            environment = android.os.Environment.DIRECTORY_PICTURES;
            callUploadActivity(environment);
            break;
        case R.id.create_new_folder :
            showToast("create_new_folder.");
            askForNewFolderName();
            break;
        default :
    }
    return super.onContextItemSelected(item);
}