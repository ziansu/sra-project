@java.lang.Override
public int hashCode() {
    int result = type.hashCode();
    return (31 * result) + (subType.hashCode());
}