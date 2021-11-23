@java.lang.Override
public org.apereo.cas.ticket.proxy.ProxyGrantingTicket grantProxyGrantingTicket(final java.lang.String id, final org.apereo.cas.authentication.Authentication authentication, final org.apereo.cas.ticket.ExpirationPolicy expirationPolicy) throws org.apereo.cas.ticket.AbstractTicketException {
    synchronized(this.lock) {
        if (this.grantedTicketAlready) {
            throw new org.apereo.cas.ticket.InvalidProxyGrantingTicketForServiceTicket(this.service);
        }
        this.grantedTicketAlready = java.lang.Boolean.TRUE;
    }
    final org.apereo.cas.ticket.proxy.ProxyGrantingTicket pgt = new org.apereo.cas.ticket.ProxyGrantingTicketImpl(id, this.service, this.getGrantingTicket(), authentication, expirationPolicy);
    getGrantingTicket().getProxyGrantingTickets().add(pgt);
    return pgt;
}