@chan.annotation.Public
public chan.http.HttpResponse read() throws chan.http.HttpException {
    chan.http.HttpResponse response = mResponse;
    if (response != null)
        return response;
    
    response = chan.http.HttpClient.getInstance().read(this);
    mResponse = response;
    return response;
}