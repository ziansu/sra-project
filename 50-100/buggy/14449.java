public void refresh() {
    red.setText(((mod.getRed()) + ""));
    black.setText(((mod.getBlack()) + ""));
    label.setText(mod.getLabel());
    view.refresh();
}