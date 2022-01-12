private void initData() {
    listImgPath = getImgPathList();
    if ((listImgPath.size()) >= 1) {
        imageUriArray = ((java.lang.String[]) (listImgPath.toArray(new java.lang.String[listImgPath.size()])));
    }
}