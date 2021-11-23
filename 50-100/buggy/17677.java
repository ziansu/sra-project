public void showContent(java.lang.String htmlContent) {
    detailsPopupContent.clear();
    detailsPopupContent.add(new com.google.gwt.user.client.ui.HTML(htmlContent));
    center();
    show();
    com.google.gwt.dom.client.Document.get().getBody().getStyle().setOverflow(Style.Overflow.HIDDEN);
    detailsPopupContent.setFocus(true);
}