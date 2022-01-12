@butterknife.OnClick(value = R.id.btnUploadPicture)
public void uploadImage() {
    com.androidapp.network.Items items = new com.androidapp.network.Items(this);
    items.addImage("", token, android.net.Uri.parse(filePath), idItem);
}