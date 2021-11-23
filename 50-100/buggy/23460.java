private void initData() {
    cn.ucai.fulicenter.bean.UserAvater user = cn.ucai.fulicenter.FuLiCenterApplication.getUser();
    cn.ucai.fulicenter.utils.ImageLoader.downloadAvatar(context, user.getMuserName(), user.getMavatarSuffix(), ivAvatartitle);
    tvName.setText(user.getMuserName());
    countGoods.setText(((findcountcollect(user.getMuserName())) + ""));
}