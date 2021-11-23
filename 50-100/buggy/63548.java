@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    super.onActivityResult(requestCode, resultCode, data);
    if (requestCode == (com.unimelb.feelinglucky.snapsheet.Chat.ChatFragment.RESULTID)) {
        if (resultCode == (getActivity().RESULT_OK)) {
            refreshFriendList();
            ((com.unimelb.feelinglucky.snapsheet.SnapSheetActivity) (getActivity())).setViewPagerItem(0);
            ((com.unimelb.feelinglucky.snapsheet.SnapSheetActivity) (getActivity())).setmChatWith(data.getStringExtra("id"));
        }
    }
}