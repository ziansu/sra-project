public void run() {
    hideLoadingAnimation();
    java.io.InputStream is;
    try {
        is = getActivity().getContentResolver().openInputStream(android.net.Uri.parse(path));
        mGifImageView.setBytes(com.mde.potdroid.fragments.MediaFragment.streamToBytes(is));
        mGifImageView.setVisibility(View.VISIBLE);
        mGifImageView.startAnimation();
    } catch (java.io.IOException e) {
        showError(R.string.msg_img_loading_error);
        e.printStackTrace();
    }
}