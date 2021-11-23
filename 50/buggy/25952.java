public void execute(final io.datakernel.http.HttpRequest request, final int timeout, final io.datakernel.http.ResultCallback<io.datakernel.http.HttpResponse> callback) {
    io.datakernel.util.Preconditions.checkNotNull(request);
    assert eventloop.inEventloopThread();
    totalRequests.recordEvent();
    getUrlAsync(request, timeout, callback);
}