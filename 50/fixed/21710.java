public void openGallery1(int req_code) {
    android.content.Intent intent = new android.content.Intent();
    intent.setType("image/*");
    intent.setAction(Intent.ACTION_GET_CONTENT);
    getActivity().startActivityForResult(android.content.Intent.createChooser(intent, "Select file to upload "), req_code);
}