public void changePrices(final de.ailis.xadrian.data.Ware focusedWare) {
    final de.ailis.xadrian.dialogs.ChangePricesDialog dialog = this.complex.getGame().getChangePricesDialog();
    dialog.setCustomPrices(this.complex.getCustomPrices());
    dialog.setActiveWare(focusedWare);
    if ((dialog.open()) == (de.ailis.xadrian.support.ModalDialog.Result.OK)) {
        this.complex.setCustomPrices(dialog.getCustomPrices());
        doChange();
        redraw();
    }
}