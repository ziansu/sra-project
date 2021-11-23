@java.lang.Override
public boolean fight(java.lang.String oponent) {
    if (this.toString().equals(oponent)) {
        return true;
    }
    return false;
}