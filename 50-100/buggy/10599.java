@java.lang.Override
public int hashCode() {
    int hash = 7;
    hash = (53 * hash) + (java.util.Objects.hashCode(this.topLeft));
    hash = (53 * hash) + (java.util.Objects.hashCode(this.bottomRight));
    return hash;
}