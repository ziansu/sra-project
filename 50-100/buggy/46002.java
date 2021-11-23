public de.mhus.lib.jms.JmsDestination setConnection(de.mhus.lib.jms.JmsConnection con) {
    if (de.mhus.lib.core.MSystem.equals(this.con, con))
        return this;
    
    this.con = con;
    reset();
    try {
        open();
    } catch (javax.jms.JMSException e) {
        log().t(e);
    }
    return this;
}