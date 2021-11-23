@java.lang.Override
public void setTwitterStatus(final java.lang.String text) {
    invokeAndWaitOnEDT(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            JLTwitterStatus.setText(text);
        }
    });
}