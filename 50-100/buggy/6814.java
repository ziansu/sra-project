public void updateCurrentTree() {
    java.lang.System.out.println("updating current tree");
    if (((mouseX) >= (FIRST_THIRD)) && ((mouseX) < (SECOND_THIRD)))
        currentTree = getInstanceTree(tree1);
    else
        if (((mouseX) >= (SECOND_THIRD)) && ((mouseX) < (LAST_THIRD)))
            currentTree = getInstanceTree(tree2);
        
    
    currentTree = getInstanceTree(tree3);
    java.lang.System.out.println("done updating current tree");
}