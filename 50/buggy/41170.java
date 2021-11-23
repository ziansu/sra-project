@java.lang.Override
public void run() {
    if (mRequestMap.get(token).equals(url))
        return ;
    
    mRequestMap.remove(token);
    mListener.onThumbnailDownloaded(token, bitmap);
}