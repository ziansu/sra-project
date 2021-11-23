@java.lang.Override
public void call(javax.net.ssl.SSLException ex) {
    if (io.apigee.trireme.node12.modules.TLSWrapStream.log.isDebugEnabled()) {
        io.apigee.trireme.node12.modules.TLSWrapStream.log.debug("Received TLS error {}", ex);
    }
    org.mozilla.javascript.Context cx = org.mozilla.javascript.Context.getCurrentContext();
    org.mozilla.javascript.Scriptable err = io.apigee.trireme.core.Utils.makeErrorObject(cx, this, ex.toString());
    f.call(org.mozilla.javascript.Context.getCurrentContext(), this, this, new java.lang.Object[]{ err });
}