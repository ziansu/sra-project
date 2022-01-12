public void checkOnline(java.lang.String userId, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
    checkReady();
    cn.edu.sjtu.se.dclab.oss.thrift.OnlineStatusQueryService.AsyncClient.checkOnline_call method_call = new cn.edu.sjtu.se.dclab.oss.thrift.OnlineStatusQueryService.AsyncClient.checkOnline_call(userId, resultHandler, this, ___protocolFactory, ___transport);
    this.___currentMethod = method_call;
    ___manager.call(method_call);
}