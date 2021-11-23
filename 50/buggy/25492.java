private java.lang.String maybeQuote(org.fife.ui.autocomplete.Completion c) {
    return c instanceof org.fife.ui.autocomplete.TemplateCompletion ? c.getReplacementText() : (org.fife.ui.autocomplete.AutoCompletion.quoteChoice(c.getReplacementText())) + (terriblyUglyWorkaroundBecauseOfLaziness());
}