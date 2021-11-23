private void addTag(java.lang.String text, int line, int column, boolean on) {
    final com.puppycrawl.tools.checkstyle.filters.SuppressionCommentFilter.Tag tag = new com.puppycrawl.tools.checkstyle.filters.SuppressionCommentFilter.Tag(line, column, text, on);
    tags.add(tag);
}