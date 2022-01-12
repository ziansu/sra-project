@java.lang.Override
protected java.lang.String getTitle() {
    if (((failure.exception.detail) == null) || ((failure.exception.detail.length()) < 1024))
        return ((failure.exception.shortName) + ": ") + (failure.exception.detail);
    else
        return failure.exception.shortName;
    
}