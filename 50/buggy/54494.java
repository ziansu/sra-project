public void addItem(com.hiwhitley.potatoandtomato.bean.Tomato tomato) {
    mItems.add(tomato);
    android.util.Log.i(com.hiwhitley.potatoandtomato.adapter.RecyclerListAdapter.TAG, ("addItem" + (mItems.size())));
    notifyItemInserted(((mItems.size()) - 1));
}