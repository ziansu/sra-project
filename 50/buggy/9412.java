public void addMessage(android.view.View view, dot.dominionofcity.LayoutParams params) {
    messageList.addView(view, params);
    handler.post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            messageWindow.fullScroll(ScrollView.FOCUS_DOWN);
        }
    });
}