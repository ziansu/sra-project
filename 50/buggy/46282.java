@java.lang.Override
public int hashCode() {
    int result = ((username) != null) ? username.hashCode() : 0;
    result = (31 * result) + (java.util.Arrays.hashCode(password));
    return result;
}