public static java.util.List<edu.stanford.muse.xword.ClueFilter> getDefaultFilters(short mode) {
    java.util.List<edu.stanford.muse.xword.ClueFilter> filters = new java.util.ArrayList<>();
    if (mode == 1) {
        filters.add(new edu.stanford.muse.xword.ClueFilter.TextFilter());
        filters.add(new edu.stanford.muse.xword.ClueFilter.AnswerFilter());
    }
    filters.add(new edu.stanford.muse.xword.ClueFilter.SelfFilter());
    return filters;
}