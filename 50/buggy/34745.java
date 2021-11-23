public void removeAll() {
    int len = this.mJokes.size();
    this.mJokes.clear();
    this.notifyItemRangeRemoved(0, len);
}