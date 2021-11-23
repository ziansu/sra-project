private void removeSelectedFile() {
    isImgSelected = false;
    isDocSelected = false;
    isPdfSelected = false;
    mImgpath = "";
    mDocpath = "";
    mPdfpath = "";
    mImgpathExtenstion = "";
    mEncodedImage = "";
    txt_path.setText("");
    txt_path.setVisibility(View.GONE);
    ll_file_layout.setVisibility(View.GONE);
    txt_close.setVisibility(View.GONE);
}