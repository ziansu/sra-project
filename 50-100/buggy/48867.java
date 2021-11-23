@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null) {
        return false;
    }
    if ((getClass()) != (obj.getClass())) {
        return false;
    }
    final org.geekygoblin.nedetlesmaki.core.backend.Position other = ((org.geekygoblin.nedetlesmaki.core.backend.Position) (obj));
    if ((this.x) != (other.x)) {
        return false;
    }
    if ((this.y) != (other.y)) {
        return false;
    }
    return true;
}