@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    csc4700.CartItem cartItem = ((csc4700.CartItem) (o));
    return (item) != null ? item.equals(cartItem.item) : (cartItem.item) == null;
}