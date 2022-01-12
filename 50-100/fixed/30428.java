@java.lang.Override
public boolean equals(java.lang.Object anObject) {
    if ((this) == anObject) {
        return true;
    }
    if (!(anObject instanceof org.candlepin.model.Product)) {
        return false;
    }
    org.candlepin.model.Product another = ((org.candlepin.model.Product) (anObject));
    return (getProductId().equals(another.getProductId())) && (name.equals(another.getName()));
}