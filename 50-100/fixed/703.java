private android.graphics.drawable.Drawable newPhoto() {
    int maxIndex = photos.length;
    int randomIndex = randomPhoto.nextInt(maxIndex);
    android.graphics.drawable.Drawable photo = null;
    try {
        java.io.InputStream stream = fragment.getActivity().getAssets().open(("photo/" + (photos[randomIndex])));
        photo = android.graphics.drawable.Drawable.createFromStream(stream, null);
    } catch (java.io.IOException e) {
        android.widget.Toast.makeText(fragment.getActivity(), "Failed to create photo", Toast.LENGTH_LONG).show();
    }
    return photo;
}