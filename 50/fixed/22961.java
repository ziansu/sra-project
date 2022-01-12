private void readPhotosName() throws java.io.IOException {
    android.content.res.AssetManager am = fragment.getActivity().getAssets();
    photos = am.list("photo");
}