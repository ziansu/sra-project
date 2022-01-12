private void writeObject(java.io.ObjectOutputStream oos) throws java.io.IOException {
    oos.defaultWriteObject();
    if ((photo) != null) {
        java.io.ByteArrayOutputStream byteStream = new java.io.ByteArrayOutputStream();
        boolean success = photo.compress(Bitmap.CompressFormat.PNG, 100, byteStream);
        if (success) {
            oos.writeObject(byteStream.toByteArray());
        }
    }else {
        oos.writeObject(new byte[1]);
    }
}