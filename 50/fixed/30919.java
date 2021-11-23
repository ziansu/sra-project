@java.lang.Override
public void onRefresh() {
    this.messageCount += 10;
    getMessages();
}