public com.escodro.savel.data.model.NetworkError handleError(java.lang.Throwable throwable) {
    if (throwable instanceof java.net.UnknownHostException) {
        getUnknownHostError();
    }else
        if (throwable instanceof retrofit2.HttpException) {
            if (throwable.getMessage().contains(com.escodro.savel.util.adapter.NetworkErrorAdapter.SERVICE_UNAVAILABLE)) {
                getServiceUnavailableError();
            }
        }
    
    return mNetworkErrorProvider;
}