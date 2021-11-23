public void setOverview() {
    android.widget.TextView tv = ((android.widget.TextView) (mRootView.findViewById(R.id.overview)));
    if ((mMovie.getOverview().length()) != 0) {
        tv.setText(mMovie.getOverview());
        tv.setTextColor(mContext.getResources().getColor(R.color.white));
    }
}