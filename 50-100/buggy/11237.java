private void updateKLargestComments() {
    componentSizeCommentMap.clear();
    for (org.wso2.siddhi.debs2016.graph.CommentLikeGraph commentLikeGraph : commentStore.values()) {
        long sizeOfComponent = commentLikeGraph.getSizeOfLargestConnectedComponent();
        if (sizeOfComponent > 0) {
            java.lang.System.out.println("DDDDDDDDDDD");
        }
        if (sizeOfComponent == 0) {
            continue;
        }
        java.lang.String comment = commentLikeGraph.getComment();
        componentSizeCommentMap.put(sizeOfComponent, comment);
        componentSizeCommentMap.hashCode();
    }
}