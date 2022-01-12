private void setup() {
    setLines(3);
    this.setOnClickListener(new net.anei.cadpage.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            net.anei.cadpage.ClearAllReceiver.clearAll(getContext());
            if ((msg) == null)
                return ;
            
            if (Log.DEBUG)
                net.anei.cadpage.Log.v(("HistoryMsgTextView User launch SmsPopup for " + (msg.getMsgId())));
            
            net.anei.cadpage.SmsPopupActivity.launchActivity(getContext(), msg);
        }
    });
}