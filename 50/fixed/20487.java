@java.lang.Override
protected boolean containsElem(java.util.List<java.lang.String> endStates, java.util.List<java.lang.String> currentStates) {
    for (java.lang.String str : currentStates) {
        if (endStates.contains(str))
            return true;
        
    }
    return false;
}