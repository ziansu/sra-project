private static void borderize(com.probearbeiten.getraenkeautomat.client.machine.view.IsWidget widget) {
    widget.asWidget().getElement().getStyle().setBorderWidth(3, Style.Unit.PX);
    widget.asWidget().getElement().getStyle().setMargin(3, Style.Unit.PX);
}