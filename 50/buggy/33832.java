@java.lang.Override
public int hashCode() {
    int result = key.hashCode();
    result = (31 * result) + (value.hashCode());
    return result;
}