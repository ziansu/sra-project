@java.lang.Override
public int hashCode() {
    int result = ((unit) != null) ? unit.hashCode() : 0;
    result = (31 * result) + ((max) != null ? max.hashCode() : 0);
    result = (31 * result) + ((min) != null ? min.hashCode() : 0);
    return result;
}