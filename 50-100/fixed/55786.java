private void readObject(java.io.ObjectInputStream ois) throws java.io.IOException, java.lang.ClassNotFoundException {
    ois.defaultReadObject();
    byte[] image = ((byte[]) (ois.readObject()));
    if (((image != null) && ((image.length) > 0)) && (image != new byte[1])) {
        photo = android.graphics.BitmapFactory.decodeByteArray(image, 0, image.length);
    }
}