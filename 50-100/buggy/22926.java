@java.lang.Override
public org.vsg.cusp.engine.rapidoid.specimpl.AsyncHttpRequestImpl call() throws java.lang.Exception {
    injectParameterInstanceToMethod(mpMetaInfo, hreq, fullPath.toString());
    try {
        for (java.lang.Object param : mpMetaInfo.getParams()) {
            java.lang.System.out.println(((("param : " + param) + " , ") + (param.getClass())));
        }
        java.lang.Object returnVal = method.invoke(inst, mpMetaInfo.getParams());
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    hreq.close();
    return hreq;
}