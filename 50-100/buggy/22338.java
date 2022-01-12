@java.lang.Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = (prime * result) + (getOuterType().hashCode());
    result = (prime * result) + (length);
    result = (prime * result) + ((u) == null ? 0 : u.hashCode());
    return result;
}