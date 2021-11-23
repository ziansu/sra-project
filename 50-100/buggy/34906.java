public static util.NodeSet union(util.NodeSet set1, util.NodeSet set2) {
    util.NodeSet smallerSet;
    util.NodeSet biggerSet;
    if ((set1.size) <= (set2.size)) {
        smallerSet = set1;
        biggerSet = set2;
    }else {
        smallerSet = set2;
        biggerSet = set1;
    }
    biggerSet.lastElement.nextRef = smallerSet.firstElement;
    biggerSet.lastElement = smallerSet.lastElement;
    biggerSet.size += smallerSet.size;
    util.NodeSetElement element = smallerSet.firstElement;
    element.setRef = biggerSet;
    while ((element.nextRef) != null) {
        element.setRef = biggerSet;
        element = element.nextRef;
    } 
    return biggerSet;
}