public boolean shutdown() {
    final boolean res = this.feedState.compareAndSet(com.epam.cme.mdp3.core.channel.ACTIVE, com.epam.cme.mdp3.core.channel.PENDING_SHUTDOWN);
    if (res && ((selector) != null)) {
        selector.wakeup();
    }
    return res;
}