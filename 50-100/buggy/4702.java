public static int getUnconfirmedCount(java.util.List<com.breadwallet.presenter.entities.TransactionListItem> items) {
    int count = 0;
    com.breadwallet.tools.adapter.TransactionListAdapter.updateEstimatedBlockHeight();
    for (com.breadwallet.presenter.entities.TransactionListItem t : items) {
        if (t == null)
            continue;
        
        int blockHeight = t.getBlockHeight();
        int confirms = (blockHeight == (java.lang.Integer.MAX_VALUE)) ? 0 : ((com.breadwallet.tools.adapter.TransactionListAdapter.estimatedBlockHeight) - blockHeight) + 1;
        if ((blockHeight != (java.lang.Integer.MAX_VALUE)) && (confirms < 6)) {
            count++;
        }
    }
    return count;
}