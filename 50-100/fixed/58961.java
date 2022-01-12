public void setImages(java.util.List<com.lzy.imagepicker.bean.ImageItem> data) {
    mData = new java.util.ArrayList(data);
    if (!(readOnly)) {
        if ((getItemCount()) < (maxImgCount)) {
            mData.add(new com.lzy.imagepicker.bean.ImageItem());
            isAdded = true;
        }else {
            isAdded = false;
        }
    }else {
        isAdded = false;
    }
    notifyDataSetChanged();
}