protected com.haulmont.yarg.formatters.impl.Row findNextRowForFirstRender(com.haulmont.yarg.formatters.impl.Range templateRange, java.util.List<com.haulmont.yarg.formatters.impl.Row> resultSheetRows) {
    java.util.Collection<com.haulmont.yarg.formatters.impl.Range> templateNeighbours = rangeVerticalIntersections.get(templateRange);
    for (com.haulmont.yarg.formatters.impl.Range templateNeighbour : templateNeighbours) {
        java.util.Collection<com.haulmont.yarg.formatters.impl.Range> resultRanges = rangeDependencies.resultsForTemplate(templateNeighbour);
        if (!(resultRanges.isEmpty())) {
            com.haulmont.yarg.formatters.impl.Range firstResultRange = resultRanges.iterator().next();
            return resultSheetRows.get(((firstResultRange.getFirstRow()) - 1));
        }
    }
    return null;
}