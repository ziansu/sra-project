@java.lang.Override
protected void prepareAnimateAdd(android.support.v7.widget.RecyclerView.ViewHolder holder) {
    android.support.v4.view.ViewCompat.setTranslationX(holder.itemView, ((mSwipeDirection.getSign()) * (mRecyclerView.getWidth())));
}