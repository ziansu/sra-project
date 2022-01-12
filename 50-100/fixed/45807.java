@java.lang.Override
protected void onHttpContentEncoded(final org.glassfish.grizzly.http.HttpContent content, final org.glassfish.grizzly.filterchain.FilterChainContext ctx) {
    final com.ning.http.client.providers.grizzly.HttpTransactionContext context = com.ning.http.client.providers.grizzly.HttpTransactionContext.currentTransaction(content.getHttpHeader());
    final com.ning.http.client.AsyncHandler handler = context.getAsyncHandler();
    if (handler instanceof com.ning.http.client.listener.TransferCompletionHandler) {
        final int written = content.getContent().remaining();
        context.totalBodyWritten += written;
        final long total = context.totalBodyWritten;
        ((com.ning.http.client.listener.TransferCompletionHandler) (handler)).onContentWriteProgress(written, total, content.getHttpHeader().getContentLength());
    }
}