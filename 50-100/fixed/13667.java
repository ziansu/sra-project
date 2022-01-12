private void replyMessage() {
    if (!(eNodeBMessages.isEmpty())) {
        failover.Message m = eNodeBMessages.poll();
        failover.ENodeB e = m.removeBreadcrumb();
        m.setController(this);
        e.replyMessage(m);
    }
}