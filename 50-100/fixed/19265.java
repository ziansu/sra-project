private boolean isInWhileOrFor(VC.Checker.AST currentParent) {
    if (currentParent == null) {
        return false;
    }
    boolean isFound = false;
    while (true) {
        if ((currentParent instanceof VC.Checker.WhileStmt) || (currentParent instanceof VC.Checker.ForStmt)) {
            isFound = true;
            break;
        }else {
            currentParent = currentParent.parent;
            if (currentParent == null) {
                break;
            }
        }
    } 
    return isFound;
}