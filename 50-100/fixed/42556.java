@java.lang.Override
public int hashCode() {
    int hash = 3;
    hash = (13 * hash) + ((int) ((this.getOrderID()) ^ ((this.getOrderID()) >>> 32)));
    return hash;
}