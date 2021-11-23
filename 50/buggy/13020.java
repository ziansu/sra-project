public DataBean.PicBean getItem(int positon) {
    if (isGallery)
        return gallery2PicBean(myFavorites.get(positon));
    
    return mPics.get(positon);
}