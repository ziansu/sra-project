public void subHelper2(Topic one, boolean stop) {
    Topic x = one.parent;
    if ((x.isParPar()) == true) {
        stop = true;
    }
    int ind = x.subtopics.indexOf(one);
    for (int i = ind + 1; i < (x.subtopics.size()); i++) {
        x.getSub(i).shiftDown();
    }
    if (!stop) {
        subHelper2(x, false);
    }
}