private void checkFromValidFe(com.baidu.palo.http.BaseRequest request, com.baidu.palo.http.BaseResponse response) throws com.baidu.palo.http.meta.InvalidClientException {
    if (!(isFromValidFe(request))) {
        throw new com.baidu.palo.http.meta.InvalidClientException("invalid client host");
    }
}