public void setResponse(java.util.Map<java.lang.String, java.lang.String> map) {
    this.content = server.JSONUtil.map2json(map);
}