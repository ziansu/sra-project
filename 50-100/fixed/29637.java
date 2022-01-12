@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot snapshot) {
    if (!(snapshot.getValue().toString().equals("0"))) {
        java.lang.String base64Image = ((java.lang.String) (snapshot.getValue()));
        byte[] imageAsBytes = android.util.Base64.decode(base64Image.getBytes(), Base64.DEFAULT);
        imageView.setImageBitmap(android.graphics.BitmapFactory.decodeByteArray(imageAsBytes, 0, imageAsBytes.length));
    }
}