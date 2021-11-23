@butterknife.OnClick(value = R.id.btnUploadPicture)
public void uploadImage() {
    com.androidapp.network.Items items = new com.androidapp.network.Items(this);
    items.getItemList("getItemList", token);
    items.addImage("", token, android.net.Uri.parse(filePath), idItem);
}