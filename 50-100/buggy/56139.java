@java.lang.Override
public int compareTo(final couch.cushion.media.ImageSegment other) {
    if ((getId()) < (other.getId())) {
        return -1;
    }
    if ((getId()) > (other.getId())) {
        return 1;
    }
    if ((getIndex()) < (other.getIndex())) {
        return -1;
    }
    if ((getIndex()) > (other.getIndex())) {
        return -1;
    }
    return 0;
}