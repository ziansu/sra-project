@java.lang.Override
public int compare(final soot.SootClass a, final soot.SootClass b) {
    if (a == b)
        return 0;
    
    hierarchy = soot.Scene.v().getActiveHierarchy();
    if (hierarchy.isClassSubclassOf(a, b))
        return -1;
    
    if (hierarchy.isClassSuperclassOf(a, b))
        return 1;
    
    return 0;
}