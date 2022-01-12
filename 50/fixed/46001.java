@java.lang.Override
public boolean isTrim(int index) {
    if (((trimMap) == null) || (trimMap.isEmpty())) {
        return false;
    }
    return trimMap.get(index);
}