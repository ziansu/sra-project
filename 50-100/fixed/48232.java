@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    com.ofo.domain.CartItem cartItem = ((com.ofo.domain.CartItem) (o));
    return externalItemId.equals(cartItem.externalItemId);
}