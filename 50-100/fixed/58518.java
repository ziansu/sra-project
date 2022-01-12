private java.util.LinkedList<java.lang.String> generateUploadList() {
    java.util.LinkedList<java.lang.String> uploadList = new java.util.LinkedList<>();
    java.lang.String filePath;
    int length = mSelectedList.size();
    for (int i = 0; i < length; i++) {
        filePath = ((mImgDirPath) + "/") + (mImgs.get(((java.lang.Integer) (mSelectedList.get(i)))));
        uploadList.add(filePath);
    }
    return uploadList;
}