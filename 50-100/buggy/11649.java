@java.lang.Override
public int hashCode() {
    int result = super.hashCode();
    result = (31 * result) + ((t1) != null ? t1.hashCode() : 0);
    result = (31 * result) + ((t2) != null ? t2.hashCode() : 0);
    return result;
}