@java.lang.Override
public boolean equals(java.lang.Object other) {
    if (other instanceof website.frontrow.util.Point) {
        return false;
    }
    website.frontrow.util.Point that = ((website.frontrow.util.Point) (other));
    if ((this.x) != (that.x)) {
        return false;
    }
    if ((this.y) != (that.y)) {
        return false;
    }
    return true;
}