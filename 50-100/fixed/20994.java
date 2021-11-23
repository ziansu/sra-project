void forward() {
    needsForward = false;
    if ((index) < (directCount)) {
        (index)++;
        if ((index) < (directCount)) {
            return ;
        }
    }else {
        (subIndex)++;
    }
    if ((index) < (edges.getCount())) {
        forwardNodeList();
    }
}