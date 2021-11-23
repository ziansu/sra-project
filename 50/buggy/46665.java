public boolean mazeNotCompleted() {
    boolean reachedExit = false;
    if ((maze[0][18]) == "X") {
        reachedExit = true;
    }else {
        reachedExit = false;
    }
    return reachedExit;
}