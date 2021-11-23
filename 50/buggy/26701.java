@java.lang.Override
public int hashCode() {
    int result = granularityType.hashCode();
    result = (31 * result) + (periodGranularity.hashCode());
    return result;
}