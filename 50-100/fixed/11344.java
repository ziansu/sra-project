public void setMessageForMultiList(@android.support.annotation.StringRes
int headline, @android.support.annotation.StringRes
int message, @android.support.annotation.DrawableRes
int icon) {
    if (((mMultiListContainer) != null) && ((mMultiListMessage) != null)) {
        mMultiListHeadline.setText(headline);
        mMultiListMessage.setText(message);
        mMultiListIcon.setImageResource(icon);
        mMultiListMessage.setVisibility(View.VISIBLE);
        mMultiListIcon.setVisibility(View.VISIBLE);
        mMultiListProgress.setVisibility(View.GONE);
    }
}