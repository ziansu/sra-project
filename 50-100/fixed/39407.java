@java.lang.Override
public void format(final org.eclipse.xtext.formatting2.IFormattableSubDocument doc) throws org.eclipse.xtext.formatting2.FormattingNotApplicableException {
    final org.eclipse.xtext.xbase.lib.Procedures.Procedure1<org.eclipse.xtext.formatting2.IHiddenRegionFormatter> _function = new org.eclipse.xtext.xbase.lib.Procedures.Procedure1<org.eclipse.xtext.formatting2.IHiddenRegionFormatter>() {
        @java.lang.Override
        public void apply(final org.eclipse.xtext.formatting2.IHiddenRegionFormatter it) {
            it.oneSpace();
        }
    };
    final org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion last = this.formatClosureParams(expr, open, doc, _function);
    this.formatExpressionsMultiline(children, last, close, doc);
}