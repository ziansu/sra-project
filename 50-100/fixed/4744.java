public int findForwardingLevel(java.lang.String user, DynamicTreeNode oldLocation) {
    int level = 0;
    int result = level;
    int max = getCMR(user, oldLocation);
    int lastLevel = max;
    while ((oldLocation.parent) != null) {
        level++;
        oldLocation = oldLocation.parent;
        int aggCMR = getAggCMR(user, oldLocation);
        if ((aggCMR - lastLevel) > max) {
            max = aggCMR - lastLevel;
            result = level;
        }
        lastLevel = aggCMR;
    } 
    java.lang.System.out.println(result);
    return result;
}