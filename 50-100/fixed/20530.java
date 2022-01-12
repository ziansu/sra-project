public static qora.web.blog.BlogEntry getBlogEntryOpt(byte[] signature) {
    qora.transaction.ArbitraryTransaction transaction = null;
    try {
        transaction = ((qora.transaction.ArbitraryTransaction) (controller.Controller.getInstance().getTransaction(signature)));
    } catch (java.lang.Exception e) {
        return null;
    }
    return transaction == null ? null : utils.BlogUtils.getBlogEntryOpt(transaction);
}