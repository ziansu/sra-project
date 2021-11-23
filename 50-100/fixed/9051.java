@java.lang.Override
public org.jasig.cas.ticket.proxy.ProxyGrantingTicket grantProxyGrantingTicket(final java.lang.String id, final org.jasig.cas.authentication.Authentication authentication, final org.jasig.cas.ticket.ExpirationPolicy expirationPolicy) {
    synchronized(this) {
        if (this.grantedTicketAlready) {
            throw new java.lang.IllegalStateException("PGT already generated for this ST. Cannot grant more than one TGT for ST");
        }
        this.grantedTicketAlready = java.lang.Boolean.TRUE;
    }
    return new org.jasig.cas.ticket.ProxyGrantingTicketImpl(id, service, this.getGrantingTicket(), authentication, expirationPolicy);
}