@java.lang.Override
public org.vsg.cusp.engine.rapidoid.specimpl.AsyncHttpRequestImpl call() throws java.lang.Exception {
    injectParameterInstanceToMethod(mpMetaInfo, hreq, fullPath.toString());
    try {
        java.lang.Object returnVal = method.invoke(inst, mpMetaInfo.getParams());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    hreq.close();
    return hreq;
}