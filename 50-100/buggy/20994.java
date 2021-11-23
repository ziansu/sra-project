void forward() {
    needsForward = false;
    if ((index) < (directCount)) {
        (index)++;
        return ;
    }else {
        (subIndex)++;
    }
    if ((index) < (edges.getCount())) {
        forwardNodeList();
    }
}