@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if (!(o instanceof co.megaterios.shoppingcarttest.models.Product))
        return false;
    
    co.megaterios.shoppingcarttest.models.CartProduct cartProduct = ((co.megaterios.shoppingcarttest.models.CartProduct) (o));
    return getId().equals(cartProduct.getId());
}