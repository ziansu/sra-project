@java.lang.Override
public int hashCode() {
    int result = ((unit) != null) ? unit.hashCode() : 0;
    result = (31 * result) + (max.hashCode());
    result = (31 * result) + (min.hashCode());
    return result;
}