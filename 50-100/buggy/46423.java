@java.lang.Override
public boolean equals(java.lang.Object obj) {
    boolean eq = false;
    pkgData.Player tmpP;
    if (obj != null) {
        if (obj instanceof pkgData.Player) {
            tmpP = ((pkgData.Player) (obj));
            eq = (this.getId()) == (tmpP.getId());
        }
    }
    return eq;
}