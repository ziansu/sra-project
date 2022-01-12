private int includeLevel(fi.thl.pivot.model.FilterablePivot.IncludeStrategy strategy, int level, int index) {
    for (@java.lang.SuppressWarnings(value = "unused")
    fi.thl.pivot.model.DimensionNode node : strategy.get(level)) {
        if (!(shouldFilter(strategy, level, index))) {
            index = include(strategy, (level + 1), index);
        }else {
            index += strategy.getRepetitionFactory(level);
        }
    }
    return index;
}