@chan.annotation.Public
public chan.http.HttpResponse read() throws chan.http.HttpException {
    chan.http.HttpHolder holder = execute();
    try {
        if ((mRequestMethod) == (chan.http.HttpRequest.REQUEST_METHOD_HEAD))
            return null;
        
        return holder.read();
    } catch (chan.http.HttpException e) {
        mHolder.disconnect();
        throw e;
    }
}