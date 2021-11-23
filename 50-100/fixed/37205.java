@java.lang.Override
public int compareTo(org.nerdpower.tabula.Rectangle other) {
    double thisBottom = this.getBottom();
    double otherBottom = other.getBottom();
    int rv;
    if (this.equals(other))
        return 0;
    
    if ((this.verticalOverlap(other)) > (org.nerdpower.tabula.Rectangle.VERTICAL_COMPARISON_THRESHOLD)) {
        rv = java.lang.Double.compare(this.getX(), other.getX());
    }else {
        rv = java.lang.Double.compare(thisBottom, otherBottom);
    }
    return rv;
}