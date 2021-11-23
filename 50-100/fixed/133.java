@chan.annotation.Public
public chan.http.HttpResponse read() throws chan.http.HttpException {
    execute();
    try {
        if ((mRequestMethod) == (chan.http.HttpRequest.REQUEST_METHOD_HEAD))
            return null;
        
        return mHolder.read();
    } catch (chan.http.HttpException e) {
        mHolder.disconnect();
        throw e;
    }
}