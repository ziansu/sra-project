public java.lang.String createEntityHeader() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append(("Allow: " + "GET, HEAD")).append("\n");
    sb.append(("Content-Language: " + "ja, en")).append("\n");
    sb.append(jp.co.topgate.sugawara.web.MIME.selectContentType(".html")).append("\n");
    java.lang.String entityHeader = new java.lang.String(sb);
    return entityHeader;
}