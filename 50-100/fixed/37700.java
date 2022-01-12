public boolean isVisible() {
    if (isLocal)
        return true;
    
    if ((ashc.semantics.BitOp.and(modifiers, EnumModifier.PUBLIC.intVal)) || ((modifiers) == 0))
        return true;
    
    if (((enclosingType) != null) && (enclosingType.equals(ashc.semantics.Semantics.currentType())))
        return true;
    
    if (ashc.semantics.BitOp.and(modifiers, EnumModifier.PRIVATE.intVal))
        return false;
    
    if (ashc.semantics.Semantics.currentType().hasSuper(enclosingType.qualifiedName))
        return true;
    
    return false;
}