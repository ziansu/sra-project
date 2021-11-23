private void add(primitives.EndPoint endPT, java.lang.String funcName) {
    if (null == endPT) {
        test.config.constants.apiDocs.MasterApiDoc.doError("[Endpoint supplied was null]");
    }
    endPT.SERVLET_CLASS = _sclass;
    endPT.SERVLET_NAME = _sname;
    endPT.URL = ((_surl) + "/") + funcName;
}