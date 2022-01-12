@java.lang.Override
public void onPause() {
    super.onPause();
    fragment.fav.deatchChatDb();
    fragment.fav.chattingUsers.clear();
    fragment.fav.chattingAdapter.notifyDataSetChanged();
}