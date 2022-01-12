public Type pop() {
    if ((myTopNode) == null);
    Type theTop = null;
    if (!(myIsItEmpty)) {
        theTop = myTopNode.myItem;
        if ((myTopNode.myPrevNode) == null) {
            myIsItEmpty = true;
            myTopNode = null;
            (mySize)--;
            return theTop;
        }
        (mySize)--;
        myTopNode.myPrevNode.myNextNode = null;
        myTopNode = myTopNode.myPrevNode;
    }
    return theTop;
}