@java.lang.Override
public <T> T convertIfNeeded(java.lang.String paramKey, java.lang.Object paramValue) {
    if (((paramTypeMap) != null) && ((paramTypeMap.get(paramKey)) != null)) {
        return ((T) (convert(paramValue, paramTypeMap.get(paramKey))));
    }
    return ((T) (paramValue));
}