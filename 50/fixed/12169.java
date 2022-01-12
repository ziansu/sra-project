public void swapImages(java.util.ArrayList<java.lang.String> data) {
    imageList = (data == null) ? new java.util.ArrayList<java.lang.String>() : data;
    notifyDataSetChanged();
}