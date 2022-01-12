@java.lang.Override
protected void registerWidget(org.uva.taxfree.ql.gui.widgets.Widget widget) {
    widget.updateStyle(mStyle);
    for (org.uva.taxfree.qls.GuiPage page : mPages) {
        if (page.contains(widget.getId())) {
            java.lang.String sectionName = mStyle.getSectionName(widget.getId());
            page.register(sectionName, widget);
        }
    }
}