@java.lang.Override
public int hashCode() {
    final int prime = 1013;
    int hashCode = prime * (getName().hashCode());
    hashCode = hashCode + (null == (getParentNode()) ? 0 : getParentNode().hashCode());
    return hashCode;
}