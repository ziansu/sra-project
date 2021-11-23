private void onExit(com.shedhack.trace.request.api.model.RequestModel request) {
    for (com.shedhack.trace.request.api.interceptor.TraceRequestInterceptor interceptor : interceptors) {
        interceptor.onEntry(request);
    }
}