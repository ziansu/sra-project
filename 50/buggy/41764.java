@java.lang.Override
protected boolean hasDone() {
    if (((time) >= (maxduration)) || (!(result.equalsIgnoreCase("no")))) {
        return true;
    }
    return false;
}