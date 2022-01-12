@java.lang.Override
public int hashCode() {
    int hash = 7;
    hash = (53 * hash) + (this.topLeft.hashCode());
    hash = (53 * hash) + (this.bottomRight.hashCode());
    return hash;
}