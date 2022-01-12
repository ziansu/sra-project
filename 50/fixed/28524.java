boolean isGlobalVar(java.lang.String varName) {
    com.google.javascript.jscomp.NTIScope s = this;
    while ((s.parent) != null) {
        if (s.isDefinedLocally(varName, false)) {
            return false;
        }
        s = s.parent;
    } 
    return true;
}