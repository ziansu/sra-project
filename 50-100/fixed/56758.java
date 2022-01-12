@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (!(obj instanceof org.jfree.data.Range)) {
        return false;
    }
    org.jfree.data.Range range = ((org.jfree.data.Range) (obj));
    if (!((this.lower) == (range.lower))) {
        return false;
    }
    if (!((this.upper) == (range.upper))) {
        return false;
    }
    return true;
}