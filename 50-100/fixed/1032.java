@java.lang.Override
public int hashCode() {
    int result = category;
    result = (31 * result) + ((name) != null ? name.hashCode() : 0);
    result = (31 * result) + ((value) != null ? value.hashCode() : 0);
    return result;
}