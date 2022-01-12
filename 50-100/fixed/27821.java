@java.lang.Override
public int hashCode() {
    int hash = 1;
    hash = (hash * 31) + (this.myType.ordinal());
    hash = (hash * 31) + (this.getXCoord());
    hash = (hash * 31) + (this.getYCoord());
    return hash;
}