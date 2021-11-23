private boolean styleContains(java.lang.String state) {
    state = (state == null) ? "" : state;
    java.lang.String style = getStyle();
    return (style != null) && (style.contains(state));
}