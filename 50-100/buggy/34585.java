private com.koushikdutta.async.http.AsyncHttpPost getTimeout(int fileType, com.koushikdutta.async.http.AsyncHttpPost post) {
    switch (fileType) {
        case PREVIEW_IMAGE :
            post.setTimeout(20000);
            return post;
        case PREVIEW_VIDEO :
            post.setTimeout(120000);
            return post;
        case PREVIEW_GIF :
            post.setTimeout(30000);
            return post;
        case PREVIEW_TEXT :
            post.setTimeout(15000);
            return post;
        default :
            return null;
    }
}