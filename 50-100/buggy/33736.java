@java.lang.Override
public int hashCode() {
    final int prime = 1013;
    int hashCode = prime * (getName().hashCode());
    hashCode = prime + (null == (getParentNode()) ? 0 : getParentNode().hashCode());
    return hashCode;
}