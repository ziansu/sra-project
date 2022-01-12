@java.lang.Override
public int hashCode() {
    int result = interval.hashCode();
    result = (31 * result) + (isSnp() ? 1 : 0);
    result = (31 * result) + (isIndel() ? 1 : 0);
    return result;
}