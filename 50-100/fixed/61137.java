protected java.lang.String processYesterday(java.util.ArrayList<java.lang.String> contentToAnalyse) {
    for (int i = 0; i < (contentToAnalyse.size()); i++) {
        if (contentToAnalyse.get(i).toLowerCase().contains(" ytd ")) {
            contentToAnalyse.remove(i);
            contentToAnalyse.set(i, " yesterday ");
        }
    }
    return toStringTaskElements(contentToAnalyse);
}