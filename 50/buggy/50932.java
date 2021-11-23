@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    chatRoomID = getArguments().getString(umd.cmsc436.cmsc436finalproject.UsersChatRoomFragment.ARG_CHATROOM_ID);
    chatRoomNAME = getArguments().getString(umd.cmsc436.cmsc436finalproject.UsersChatRoomFragment.ARG_CHATROOM_NAME);
}