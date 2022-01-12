public org.mariotaku.microblog.library.twitter.model.ErrorInfo[] getErrors() {
    if ((((errors) == null) && ((errorMessage) != null)) && ((requestPath) != null)) {
        return new org.mariotaku.microblog.library.twitter.model.ErrorInfo[]{ new org.mariotaku.microblog.library.MicroBlogException.SingleErrorInfo(errorMessage, requestPath) };
    }
    return errors;
}