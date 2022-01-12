@java.lang.Override
public void cancelEdit() {
    super.cancelEdit();
    this.setText(alignText(getItem().toString()));
    this.setGraphic(null);
}