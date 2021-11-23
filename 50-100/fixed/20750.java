@java.lang.Override
public void visit(qls.astnodes.StyleSheet styleSheet) {
    for (qls.astnodes.sections.DefaultStyle style : styleSheet.getDefaultStyle()) {
        if (!(style.getWidget().isUndefined())) {
            currentDefaultWidget = style.getWidget();
        }
    }
    for (qls.astnodes.sections.Section section : styleSheet.getSections()) {
        section.accept(this);
    }
}