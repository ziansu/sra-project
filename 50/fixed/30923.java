private int moveTargetView(float dy, boolean isDragging) {
    int target = ((int) ((mTargetCurrentOffset) + dy));
    return moveTargetViewTo(target, isDragging);
}