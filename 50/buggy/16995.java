public boolean isOpposite(net.clonecomputers.genetics.shotgun.Base other) {
    return ((this.isUnknown()) || (other.isUnknown())) || (other.equals(this.getOpposite(other)));
}