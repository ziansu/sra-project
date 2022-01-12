public de.mhus.lib.jms.JmsDestination setConnection(de.mhus.lib.jms.JmsConnection con) {
    if (de.mhus.lib.core.MSystem.equals(this.con, con))
        return this;
    
    this.con = con;
    try {
        reset();
        open();
    } catch (java.lang.Exception e) {
        log().t(e);
    }
    return this;
}