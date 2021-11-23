private android.graphics.drawable.Drawable newPhoto() {
    int maxIndex = photos.length;
    int randomIndex = randomPhoto.nextInt(maxIndex);
    android.graphics.drawable.Drawable photo = null;
    try {
        java.io.InputStream stream = fragment.getContext().getAssets().open(("photo/" + (photos[randomIndex])));
        photo = android.graphics.drawable.Drawable.createFromStream(stream, null);
    } catch (java.io.IOException e) {
        android.widget.Toast.makeText(fragment.getContext(), "Failed to create photo", Toast.LENGTH_LONG).show();
    }
    return photo;
}