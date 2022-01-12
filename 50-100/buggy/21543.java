public void prepareSending() {
    this.actions.add(SendAction.START);
    this.actions.add(SendAction.XML);
    this.actions.add(SendAction.ZIP);
    this.actions.add(SendAction.SEND);
    this.actions.add(SendAction.END);
    this.progressBar.setMax(100);
    this.fillValue = (100 / (this.actions.size())) - 1;
    this.senderThread.start();
}