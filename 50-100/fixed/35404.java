@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if ((obj == null) || ((obj.getClass()) != (this.getClass()))) {
        return false;
    }
    pl.io4.model.Product product = ((pl.io4.model.Product) (obj));
    if (product.getId().equals(this.getId())) {
        return true;
    }
    return false;
}