public static qora.web.blog.BlogEntry getBlogEntryOpt(byte[] signature) {
    try {
        qora.transaction.ArbitraryTransaction transaction = ((qora.transaction.ArbitraryTransaction) (controller.Controller.getInstance().getTransaction(signature)));
        return utils.BlogUtils.getBlogEntryOpt(transaction);
    } catch (java.lang.Exception e) {
        throw api.ApiErrorFactory.getInstance().createError(ApiErrorFactory.ERROR_BLOG_ENTRY_NO_EXISTS);
    }
}