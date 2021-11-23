private com.jarektoro.responsivelayout.ResponsiveColumn.Rule getRuleForDisplaySize(com.jarektoro.responsivelayout.ResponsiveColumn.DisplaySize displaySize, boolean isOffset) {
    final com.jarektoro.responsivelayout.ResponsiveColumn.Rule[] foundRule = new com.jarektoro.responsivelayout.ResponsiveColumn.Rule[]{ null };
    rules.forEach(( rule) -> {
        if (rule.displaySize.equals(displaySize)) {
            if ((rule.isOffset) == isOffset) {
                foundRule[0] = rule;
            }
        }
    });
    return foundRule[0];
}