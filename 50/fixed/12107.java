private void reloadDimens() {
    android.content.res.Resources res = mContext.getResources();
    mIconSize = res.getDimensionPixelSize(R.dimen.status_bar_icon_size);
    mIconHPadding = res.getDimensionPixelSize(R.dimen.status_bar_icon_padding);
    mIconWidth = context.getResources().getDimensionPixelSize(R.dimen.status_bar_icon_size);
}