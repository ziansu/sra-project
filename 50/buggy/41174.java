public void initData(com.bumptech.glide.RequestManager manager, com.mobcent.discuz.bean.Banner banner) {
    this.banner = banner;
    com.litesuits.android.log.Log.d("Banner", ("startLoad:" + (banner.getImg())));
}