@java.lang.Override
public final int hashCode() {
    final int prime = 31;
    int result = 1;
    result = (prime * result) + ((filter) == null ? 0 : filter.hashCode());
    result = (prime * result) + (flags);
    result = (prime * result) + (query.hashCode());
    return result;
}