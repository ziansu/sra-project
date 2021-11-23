@java.lang.Override
public void refresh(java.util.List<?> pojos, long timestamp, double smoothingWindow) {
    if (refreshable) {
        for (java.lang.Object pojo : pojos) {
            java.util.List<?> currentList = ((java.util.List<?>) (fetcher.fetchFrom(pojo)));
            for (java.lang.Object element : currentList) {
                subNode.refresh(java.util.Arrays.asList(element), timestamp, smoothingWindow);
            }
        }
    }
}