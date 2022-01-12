private int includeLeafLevel(fi.thl.pivot.model.FilterablePivot.IncludeStrategy strategy, int level, int index) {
    for (@java.lang.SuppressWarnings(value = "unused")
    fi.thl.pivot.model.DimensionNode node : strategy.get(level)) {
        if (shouldFilter(strategy, level, index)) {
            ++index;
        }else {
            strategy.add(index);
            index++;
        }
    }
    return index;
}