@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.save_item :
            enterNewFloraItem();
            setResult(com.example.tracy.instaflora.RESULT_OK);
            finish();
            return true;
        case R.id.locate :
            changeLocation();
            return true;
        case R.id.gallery :
            android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(intent, com.example.tracy.instaflora.FloraAddItem.GET_PICTURE_FROM_GALLERY);
            return true;
        case android.R.id.home :
            com.example.tracy.instaflora.FloraAddItem.locationChosen = false;
            break;
    }
    return super.onOptionsItemSelected(item);
}