@java.lang.Override
public java.lang.Object decode(com.yiwugou.homer.core.Response response, java.lang.reflect.Type returnType) {
    if (returnType.equals(void.class)) {
        return null;
    }
    byte[] body = response.getBody();
    if ((body == null) || ((body.length) == 0)) {
        return null;
    }
    java.lang.String str = new java.lang.String(body, com.yiwugou.homer.core.constant.Constants.UTF_8);
    try {
        return com.yiwugou.homer.core.util.CommonUtils.stringToBasic(str, returnType);
    } catch (java.lang.Exception e) {
        throw new com.yiwugou.homer.core.exception.DecoderException(e);
    }
}