public void setInteractive(final boolean interactive) {
    btnMinus.setEnabled(interactive);
    btnPlus.setEnabled(interactive);
    setDirty();
}