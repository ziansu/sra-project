public void refresh() {
    red.setText(java.lang.Integer.toString(mod.getRed()));
    black.setText(java.lang.Integer.toString(mod.getBlack()));
    label.setText(mod.getLabel());
    view.refresh();
}