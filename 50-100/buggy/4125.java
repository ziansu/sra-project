private void initData() {
    listImgPath = getImgPathList();
    if ((listImgPath.size()) < 1) {
    }else {
        imageUriArray = ((java.lang.String[]) (listImgPath.toArray(new java.lang.String[listImgPath.size()])));
        options = new com.nostra13.universalimageloader.core.DisplayImageOptions.Builder().showStubImage(R.mipmap.ic_launcher).showImageForEmptyUri(R.mipmap.ic_launcher).showImageOnFail(R.mipmap.ic_launcher).cacheInMemory(true).cacheOnDisc(true).build();
    }
}