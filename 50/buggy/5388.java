@java.lang.Override
public int compareTo(plugins.WebOfTrust.network.input.EditionHint o) {
    checkedActivate(1);
    int result = getPriority().compareTo(o.getPriority());
    assert result == (compareTo_ReferenceImplementation(o));
    return result;
}