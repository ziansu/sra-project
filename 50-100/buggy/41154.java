protected java.lang.String processToday(java.util.ArrayList<java.lang.String> contentToAnalyse) {
    for (int i = 0; i < (contentToAnalyse.size()); i++) {
        if (todayTypes.contains(contentToAnalyse.get(i))) {
            contentToAnalyse.add(i, "today ");
            contentToAnalyse.remove((i + 1));
        }
    }
    return toStringTaskElements(contentToAnalyse);
}