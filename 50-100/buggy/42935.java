@java.lang.Override
public void onBackPressed() {
    if (chat_activity.isDrawerOpen(chat_drawer)) {
        chat_activity.closeDrawer(chat_drawer);
        return ;
    }
    android.widget.Toast.makeText(this, "한번 더 누르면 종료해요.", Toast.LENGTH_SHORT).show();
    (la.ggu.m16.m16chat.ChatActivity.BACK_PRESSED_NUM)++;
    BackPressedHandler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            la.ggu.m16.m16chat.ChatActivity.BACK_PRESSED_NUM = 0;
        }
    }, 2000);
    if ((la.ggu.m16.m16chat.ChatActivity.BACK_PRESSED_NUM) == 2) {
        BNetProtocol.disconnect();
        ChatThread.interrupt();
        super.onBackPressed();
    }
}