private boolean isInWhileOrFor(VC.Checker.AST currentParent) {
    boolean isFound = false;
    while (true) {
        if ((currentParent instanceof VC.Checker.WhileStmt) || (currentParent instanceof VC.Checker.ForStmt)) {
            isFound = true;
            break;
        }else {
            currentParent = currentParent.parent;
        }
    } 
    return isFound;
}