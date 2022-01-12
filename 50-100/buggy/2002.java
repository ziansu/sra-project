@java.lang.Override
protected java.lang.Boolean doInBackground(byte[]... image) {
    this.image = image[0];
    try {
        sendImage(image[0], image[0].length);
        return true;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return false;
    }
}