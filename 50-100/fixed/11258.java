public void print(boolean printable) {
    if (printable) {
        if ((-1) == (client.networkInterceptors().indexOf(org.fintx.http.HttpClientBase.networkInterceptor))) {
            client = client.newBuilder().addNetworkInterceptor(org.fintx.http.HttpClientBase.networkInterceptor).build();
        }
    }else {
    }
}