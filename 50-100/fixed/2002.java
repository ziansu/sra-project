@java.lang.Override
protected java.lang.Boolean doInBackground(byte[]... image) {
    this.image = image[0];
    try {
        return sendImage(image[0], image[0].length);
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return false;
    }
}