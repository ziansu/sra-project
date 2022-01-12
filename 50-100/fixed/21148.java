@java.lang.Override
protected void writeInternal(java.lang.Object obj, org.springframework.http.HttpOutputMessage outputMessage) throws java.io.IOException, org.springframework.http.converter.HttpMessageNotWritableException {
    org.springframework.http.HttpHeaders headers = outputMessage.getHeaders();
    java.lang.String text = com.alibaba.fastjson.JSON.toJSONString(obj, SerializeConfig.globalInstance, filters, dateFormat, JSON.DEFAULT_GENERATE_FEATURE, features);
    byte[] bytes = text.getBytes(charset);
    headers.setContentLength(bytes.length);
    java.io.OutputStream out = outputMessage.getBody();
    out.write(bytes);
}