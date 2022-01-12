@java.lang.Override
public int hashCode() {
    int result = ((username) != null) ? username.hashCode() : 0;
    return (31 * result) + (java.util.Arrays.hashCode(password));
}