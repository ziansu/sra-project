@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    if ((this.imageFile) != null) {
        outState.putString(com.gcw.sapienza.places.ShareActivity.BUNDLED_IMG_PATH, this.imageFile.getAbsolutePath());
    }
}