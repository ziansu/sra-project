@java.lang.Override
public int compareTo(java.lang.Object o) {
    pkgData.Player tmpP = ((pkgData.Player) (o));
    return (this.getId()) - (tmpP.getId());
}