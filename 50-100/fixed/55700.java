private void sortFieldListAndCachePositions() {
    java.util.Set<stroom.stats.configuration.StatisticField> tempSet = new java.util.HashSet(statisticFields);
    statisticFields.clear();
    statisticFields.addAll(tempSet);
    java.util.Collections.sort(statisticFields);
    fieldPositionMap.clear();
    int i = 0;
    for (final stroom.stats.configuration.StatisticField field : statisticFields) {
        fieldPositionMap.put(field.getFieldName(), (i++));
    }
}