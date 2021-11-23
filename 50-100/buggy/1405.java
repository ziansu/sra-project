private void buildBasic(android.graphics.Bitmap image, dan.dit.whatsthat.image.ImageAuthor author) throws dan.dit.whatsthat.util.BuildException {
    if (image == null) {
        throw new dan.dit.whatsthat.util.BuildException().setMissingData("Image", "Bitmap image");
    }
    mImage.mTimestamp = java.lang.System.currentTimeMillis();
    mImage.mAuthor = author;
    mImage.mImageData = new java.lang.ref.WeakReference(image);
    calculateHashAndPreferences(image);
}