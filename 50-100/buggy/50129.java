@java.lang.Override
public RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    if (viewType == (me.itangqi.buildingblocks.view.adapter.DailyListAdapter.ITEM_TYPE_IMAGE)) {
        android.util.Log.d(me.itangqi.buildingblocks.view.adapter.DailyListAdapter.TAG, "item view created");
        return new me.itangqi.buildingblocks.view.adapter.DailyListAdapter.ImageViewHolder(mLayoutInflater.inflate(R.layout.item_daily_image_info, parent, false));
    }else {
        return new me.itangqi.buildingblocks.view.adapter.DailyListAdapter.ThemeViewHolder(mLayoutInflater.inflate(R.layout.item_daily_text_info, parent, false));
    }
}