@java.lang.Override
public void updated(org.glassfish.grizzly.WriteResult result) {
    final com.ning.http.client.AsyncHandler ah = context.getAsyncHandler();
    if (ah instanceof com.ning.http.client.listener.TransferCompletionHandler) {
        final long written = result.getWrittenSize();
        final long total = context.totalBodyWritten.addAndGet(written);
        ((com.ning.http.client.listener.TransferCompletionHandler) (ah)).onContentWriteProgress(written, total, requestPacket.getContentLength());
    }
}