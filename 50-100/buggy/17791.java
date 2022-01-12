private void showDetail(us.shandian.giga.ui.adapter.MissionAdapter.ViewHolder h) {
    if (h.mission.finished)
        return ;
    
    us.shandian.giga.ui.main.DetailActivity.sManager = mManager;
    android.content.Intent i = new android.content.Intent();
    i.setAction(Intent.ACTION_MAIN);
    i.setClass(mContext, us.shandian.giga.ui.main.DetailActivity.class);
    i.putExtra("colorId", h.colorId);
    i.putExtra("id", h.position);
    mContext.startActivity(i);
}