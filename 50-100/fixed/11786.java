public java.util.List<org.fife.ui.rsyntaxtextarea.DocumentRange> getMarkedOccurrences() {
    java.util.List<org.fife.ui.rsyntaxtextarea.DocumentRange> list = new java.util.ArrayList<org.fife.ui.rsyntaxtextarea.DocumentRange>(markedOccurrences.size());
    for (org.fife.ui.rsyntaxtextarea.HighlightInfo info : markedOccurrences) {
        int start = info.getStartOffset();
        int end = (info.getEndOffset()) + 1;
        if (start <= end) {
            org.fife.ui.rsyntaxtextarea.DocumentRange range = new org.fife.ui.rsyntaxtextarea.DocumentRange(start, end);
            list.add(range);
        }
    }
    return list;
}