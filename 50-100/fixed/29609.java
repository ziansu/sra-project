private void setLikeDrawable() {
    if (liked[position]) {
        mView.setLikeDrawable(android.support.v4.content.ContextCompat.getDrawable(com.lupolupo.android.common.LupolupoAPIApplication.get(), R.drawable.ic_favorite_black_24px));
    }else {
        mView.setLikeDrawable(android.support.v4.content.ContextCompat.getDrawable(com.lupolupo.android.common.LupolupoAPIApplication.get(), R.drawable.ic_favorite_border_black_24px));
    }
}