private static byte[] encodeString(java.lang.String content) throws org.wso2.carbon.registry.core.exceptions.RegistryException {
    byte[] bytes;
    try {
        if ((org.wso2.carbon.registry.resource.services.utils.GetTextContentUtil.ENCODING) == null) {
            bytes = content.getBytes();
        }else {
            bytes = content.getBytes(org.wso2.carbon.registry.resource.services.utils.GetTextContentUtil.ENCODING);
        }
    } catch (java.io.UnsupportedEncodingException e) {
        java.lang.String msg = (org.wso2.carbon.registry.resource.services.utils.GetTextContentUtil.ENCODING) + " is unsupported encoding type";
        throw new org.wso2.carbon.registry.core.exceptions.RegistryException(msg, e);
    }
    return bytes;
}