@java.lang.Override
public int compareTo(org.fenixedu.bennu.portal.model.Functionality other) {
    if ((!(this.visible)) && (other.visible)) {
        return -1;
    }
    if ((this.visible) && (!(other.visible))) {
        return 1;
    }
    int compareTo = this.title.compareTo(other.title);
    if (compareTo != 0) {
        return compareTo;
    }
    return this.path.compareTo(other.path);
}