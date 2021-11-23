public void imageRowElementClicked(android.net.Uri uri) {
    if (uri == null) {
        view().pickNewImage((((nazacheres.com.pixelperfect.Utils.PPStatic.APP_NAME) + "/") + (projectName)), imageUris.size());
    }else {
        view().focusOnImage(uri);
    }
}