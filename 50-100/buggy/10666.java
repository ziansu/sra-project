@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (position == 0) {
        android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        intent.setType("image/*");
        startActivityForResult(android.content.Intent.createChooser(intent, "Deep Life"), 1);
    }else
        if (position == 4) {
            Show_DialogBox(100);
        }else {
            Show_DialogBox(position);
        }
    
}