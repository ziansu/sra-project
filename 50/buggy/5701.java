@java.lang.Override
protected Cart.DAO cartAccessor() {
    return new lib.persistence.dao.CartDAO(this);
}