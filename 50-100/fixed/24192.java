@java.lang.Override
public boolean equals(java.lang.Object other) {
    if (other instanceof website.frontrow.util.Point) {
        website.frontrow.util.Point that = ((website.frontrow.util.Point) (other));
        return ((this.x) == (that.x)) & ((this.y) == (that.y));
    }
    return false;
}