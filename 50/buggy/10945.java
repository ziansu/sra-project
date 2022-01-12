protected void closeEditWidget() {
    remove(editableValue);
    remove(buttons);
    add(valueLabel);
    new com.google.gwt.user.client.Timer() {
        @java.lang.Override
        public void run() {
            editing = false;
        }
    }.schedule(1000);
}