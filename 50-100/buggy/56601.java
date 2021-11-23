private org.eclipse.californium.core.coap.MessageObserver addBlock1CleanUpObserver(final org.eclipse.californium.core.coap.Message message, final org.eclipse.californium.core.network.stack.KeyUri key) {
    org.eclipse.californium.core.coap.MessageObserver observer = new org.eclipse.californium.core.coap.MessageObserverAdapter() {
        @java.lang.Override
        public void onCancel() {
            clearBlock1Status(key);
        }

        @java.lang.Override
        protected void failed() {
            clearBlock1Status(key);
        }
    };
    message.addMessageObserver(observer);
    return observer;
}