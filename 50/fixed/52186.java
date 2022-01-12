@java.lang.Override
protected void addSendMessage(model.event.Event event) {
    event.actionWhileCommit(new model.event.Event() {
        @java.lang.Override
        public boolean run() {
            counter.add((-1));
            return true;
        }
    });
    super.addSendMessage(event);
}