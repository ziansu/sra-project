@java.lang.Override
protected void onPostExecute(java.util.List<com.hpush.data.RecentListItem> items) {
    super.onPostExecute(items);
    if (mDataCanBeShown) {
        if ((mAdp) == null) {
            mAdp = new com.hpush.app.adapters.DailiesListAdapter(items);
            mRv.setAdapter(mAdp);
        }else {
            mAdp.setMessages(items);
            mAdp.notifyDataSetChanged();
        }
        de.greenrobot.event.EventBus.getDefault().post(new com.hpush.bus.LoadedAllDailiesEvent(items.size()));
    }
}