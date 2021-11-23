public static void show(final org.votingsystem.model.currency.Currency currency, final javafx.stage.Window parentWindow, javafx.event.EventHandler closeListener) {
    javafx.application.Platform.runLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            try {
                org.votingsystem.client.webextension.dialog.CurrencyDialog currencyDialog = new org.votingsystem.client.webextension.dialog.CurrencyDialog();
                currencyDialog.initOwner(parentWindow);
                currencyDialog.showDialog(currency);
                currencyDialog.addCloseListener(closeListener);
            } catch (java.lang.Exception ex) {
                org.votingsystem.client.webextension.dialog.CurrencyDialog.log.log(java.util.logging.Level.SEVERE, ex.getMessage(), ex);
            }
        }
    });
}