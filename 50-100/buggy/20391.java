@java.lang.Override
public void onFlow(int credit) {
    this.linkCredit.set(credit);
    while ((!(this.pendingSendsWaitingForCredit.isEmpty())) && ((this.linkCredit.get()) > 0)) {
        byte[] deliveryTag = this.pendingSendsWaitingForCredit.peek();
        this.reSend(deliveryTag, true);
        this.pendingSendsWaitingForCredit.poll();
    } 
}