public testapp.EndpointTester.ReqBuilder postJSON(java.lang.Object content) {
    this.postParams.clear();
    this.postBytes = null;
    this.format = H.Format.JSON;
    this.post();
    post(com.alibaba.fastjson.JSON.toJSONString(content));
    return this;
}