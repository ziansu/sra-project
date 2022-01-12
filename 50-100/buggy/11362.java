public void add(byte[] data, java.lang.String name, java.lang.String fileName, java.lang.String contentType) {
    dataList.add(HttpHeaders.LINE_SEPARATOR_BYTES);
    dataList.add(this.border);
    dataList.add(HttpHeaders.LINE_SEPARATOR_BYTES);
    dataList.add(buildHeaders(name, fileName, contentType));
    dataList.add(data);
}