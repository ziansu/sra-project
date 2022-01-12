protected java.util.List<java.lang.String> toSynopsisUsage(java.util.List<com.github.rvesse.airline.model.OptionMetadata> options) {
    return com.google.common.collect.ImmutableList.copyOf(com.google.common.collect.Iterables.transform(options, new com.google.common.base.Function<com.github.rvesse.airline.model.OptionMetadata, java.lang.String>() {
        public java.lang.String apply(com.github.rvesse.airline.model.OptionMetadata option) {
            if ((option.isHidden()) && (!(includeHidden()))) {
                return "";
            }
            return toUsage(option);
        }
    }));
}