protected void setDefaultSelectorOrder() {
    setSelectorOrder(((((timelineType.ordinal()) + 1L) * 2) + (isCombined ? 1 : 0)));
}