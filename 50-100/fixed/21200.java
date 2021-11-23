@java.lang.Override
public boolean isSubtypeOf(com.google.javascript.rhino.TypeI other) {
    if ((this) == other) {
        return true;
    }
    com.google.javascript.jscomp.newtypes.JSType type2 = ((com.google.javascript.jscomp.newtypes.JSType) (other));
    if ((isLoose()) || (type2.isLoose())) {
        return autobox().isSubtypeOfHelper(true, type2.autobox());
    }else {
        return isSubtypeOfHelper(true, type2);
    }
}