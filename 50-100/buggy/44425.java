private static com.vaadin.ui.TextArea addTextArea(final com.vaadin.ui.Layout layout, final java.lang.String label, final int rows, final float emWidth) {
    final com.vaadin.ui.TextArea textArea = new com.vaadin.ui.TextArea(label);
    textArea.setWordwrap(false);
    textArea.setRows(rows);
    textArea.setWidth(emWidth, Unit.EM);
    layout.addComponent(layout);
    return textArea;
}