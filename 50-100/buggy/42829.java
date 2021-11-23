@java.lang.Override
public void addToFav(int pos) {
    in.annexion.notapp.NoticeInfo item = noticeList.get(pos);
    int nID = item.n_id;
    db.execSQL(("update notices set isFav=1 where n_id=" + nID));
    android.util.Log.e("NoticesActivity", (("" + nID) + "added to favorites"));
    adapter.notifyItemChanged(pos);
    adapter.notifyDataSetChanged();
}