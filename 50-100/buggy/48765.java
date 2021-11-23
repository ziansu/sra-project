public void refreshView(java.util.ArrayList<java.lang.Integer> seen) {
    listView.setItemAnimator(null);
    final android.support.v7.widget.RecyclerView.ItemAnimator a = listView.getItemAnimator();
    for (int i : seen) {
        me.ccrama.redditslide.util.LogUtil.v(("Changed " + (i + 1)));
        notifyItemChanged((i + 1));
    }
    listView.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            listView.setItemAnimator(a);
        }
    }, 500);
}