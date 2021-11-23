public boolean mazeNotCompleted() {
    boolean reachedExit = false;
    if ((maze[0][18]) == "X") {
        reachedExit = false;
    }else {
        reachedExit = true;
    }
    return reachedExit;
}