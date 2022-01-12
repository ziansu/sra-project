private void initComponent() {
    chatList = new java.util.ArrayList<com.app.lifeshare.Model.GetChatListResponse>();
    SetToolbarTitle("CHAT");
    showBackArrow(true);
    getBundleData();
    imgNotification.setImageResource(R.drawable.info);
    imgNotification.setOnClickListener(clickListener);
    lvChat = ((android.widget.ListView) (findViewById(R.id.lvChatDetails)));
    btnSendMessage = ((android.widget.Button) (findViewById(R.id.btnSendMessage)));
    edEnterMessage = ((android.widget.EditText) (findViewById(R.id.edEnterChat)));
    this.setAdapter();
}