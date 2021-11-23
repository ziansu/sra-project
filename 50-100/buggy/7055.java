@java.lang.Override
public int hashCode() {
    final int prime = 31;
    int hashCode = 1;
    hashCode = (prime * hashCode) + ((children) == null ? 0 : children.hashCode());
    hashCode = (prime * hashCode) + ((data) == null ? 0 : data.hashCode());
    hashCode = (prime * hashCode) + ((parent) == null ? 0 : parent.hashCode());
    return hashCode;
}