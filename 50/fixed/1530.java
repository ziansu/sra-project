public void scrollToEnd() {
    mMessagesList.post(new java.util.TimerTask() {
        @java.lang.Override
        public void run() {
            mMessagesList.setSelection(((mMessagesList.getCount()) - 1));
        }
    });
}