private void setRowHover(com.google.gwt.dom.client.TableRowElement tr, boolean isHovering) {
    setRowStyleName(tr, style.hoveredRow(), style.hoveredRowCell(), isHovering);
    com.google.gwt.user.cellview.client.RowHoverEvent.fire(this, tr, (!isHovering));
}