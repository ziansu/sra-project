public com.haibin.httpnet.builder.Request build() {
    if (((mHttpContent) == null) && ((mParams) != null)) {
        if ((mParams.getMultiParams()) != null) {
            mHttpContent = new com.haibin.httpnet.core.io.MultiPartContent(mParams, mEncode);
        }else {
            mHttpContent = new com.haibin.httpnet.core.io.FormContent(mParams, mEncode);
        }
    }
    return new com.haibin.httpnet.builder.Request(this);
}