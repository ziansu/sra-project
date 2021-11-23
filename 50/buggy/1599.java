public boolean shutdown() {
    final boolean res = this.feedState.compareAndSet(com.epam.cme.mdp3.core.channel.ACTIVE, com.epam.cme.mdp3.core.channel.PENDING_SHUTDOWN);
    selector.wakeup();
    return res;
}