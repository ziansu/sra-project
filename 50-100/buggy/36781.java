@java.lang.Override
public int compareTo(org.fenixedu.bennu.portal.model.Functionality other) {
    if ((!(this.visible)) && (other.visible)) {
        return -1;
    }
    if ((this.visible) && (!(other.visible))) {
        return 1;
    }
    return this.title.compareTo(other.title);
}