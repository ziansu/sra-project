@java.lang.Override
public int hashCode() {
    return (31 * (path.hashCode())) + (regularFile ? 1 : 0);
}