public microbat.model.trace.TraceNode binarySearch() {
    java.util.Collections.sort(skipPoints, new microbat.model.trace.TraceNodeOrderComparator());
    int startIndex = skipPoints.indexOf(startNode);
    int endIndex = skipPoints.indexOf(endNode);
    if (endIndex == (-1)) {
        endIndex = (skipPoints.size()) - 1;
    }
    int index = (startIndex + endIndex) / 2;
    return skipPoints.get(index);
}