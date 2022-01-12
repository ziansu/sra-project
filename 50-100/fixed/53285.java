double slopeWith(Player.Agent other) {
    if ((this.X()) == (other.X())) {
        if ((this.Y()) < (other.Y())) {
            return java.lang.Double.POSITIVE_INFINITY;
        }else {
            return java.lang.Double.NEGATIVE_INFINITY;
        }
    }
    return ((other.Y()) - (this.Y())) / ((other.X()) - (this.X()));
}