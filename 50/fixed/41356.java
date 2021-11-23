public void setIcon(int res) {
    setIcon((0 < res ? mContext.get().getResources().getDrawable(res) : null));
}