private com.michaelalizzzyyy.school.programming.assignment.thirteen.TreeNode getSecondFarthestLeft(com.michaelalizzzyyy.school.programming.assignment.thirteen.TreeNode meh) {
    boolean done = false;
    if (meh != null) {
        while (!done) {
            if (((meh.getLeft()) != null) && ((meh.getLeft().getLeft()) != null)) {
                meh = meh.getLeft();
            }else {
                done = true;
                return meh;
            }
        } 
    }
    return meh;
}