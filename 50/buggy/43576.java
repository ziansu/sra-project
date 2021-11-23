private void saveImageUri(android.net.Uri imageUri) {
    preferences.edit().putString("imageUri", imageUri.toString()).apply();
}