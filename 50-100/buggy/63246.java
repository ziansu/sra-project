public com.google.common.base.Function<java.util.List<T>, java.lang.Boolean> createIsEnabledFunction(final int flags) {
    return new com.google.common.base.Function<java.util.List<T>, java.lang.Boolean>() {
        @java.lang.Override
        public java.lang.Boolean apply(java.util.List<T> input) {
            if (input.isEmpty()) {
                return 0 != (flags & (net.sourceforge.ganttproject.gui.AbstractTableAndActionsComponent.ENABLED_WITH_EMPTY_SELECTION));
            }else
                if ((input.size()) > 1) {
                    return 0 == (flags & (net.sourceforge.ganttproject.gui.AbstractTableAndActionsComponent.DISABLED_WITH_MULTI_SELECTION));
                }else {
                    return true;
                }
            
        }
    };
}