public void getSolve() {
    if ((left.getSolve()) != null)
        vars.addAll(left.getSolve());
    
    if ((right.getSolve()) != null)
        vars.addAll(right.getSolve());
    
}