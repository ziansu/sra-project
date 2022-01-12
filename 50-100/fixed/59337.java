public java.util.Set<in.sivareddy.graphparser.ccg.CategoryIndex> getCCvars(java.util.Set<in.sivareddy.graphparser.ccg.CategoryIndex> visitedVars) {
    java.util.Set<in.sivareddy.graphparser.ccg.CategoryIndex> ccVars = new java.util.HashSet<>();
    for (in.sivareddy.graphparser.ccg.CategoryIndex var : coordinatedVars) {
        if (visitedVars.contains(var))
            continue;
        
        visitedVars.add(var);
        if (var.isCC()) {
            ccVars.addAll(var.getCCvars(visitedVars));
        }else {
            ccVars.add(var);
        }
    }
    return ccVars;
}