boolean styleBarCanHide() {
    if ((app.has(Feature.NEW_TOOLBAR)) || (!(getAlgebraDockPanel().isStyleBarPanelShown()))) {
        return false;
    }
    int itemTop = (this.isInputTreeItem()) ? main.getElement().getAbsoluteTop() : getElement().getAbsoluteTop();
    return (itemTop - (getAlgebraDockPanel().getAbsoluteTop())) < 35;
}