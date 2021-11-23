private static void showError(fr.pasteque.client.fragments.CustomerInfoDialog self, int who) {
    switch (who) {
        case fr.pasteque.client.fragments.CustomerInfoDialog.DATAHANDLER_CUSTOMER :
            java.lang.Error.showError(R.string.err_save_online_customer, self.mParentActivity);
            break;
        case fr.pasteque.client.fragments.CustomerInfoDialog.DATAHANDLER_HISTORY :
            java.lang.Error.showError(R.string.err_search_customer_history, self.mParentActivity);
            break;
    }
}