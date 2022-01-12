@java.lang.Override
public Cart.DAO cartAccessor() {
    return new lib.persistence.dao.CartDAO(this);
}