public java.lang.String getResultStr() {
    if ((resultBytes) != null) {
        resultStr = new java.lang.String(resultBytes, java.nio.charset.Charset.forName("utf-8"));
    }
    return resultStr;
}