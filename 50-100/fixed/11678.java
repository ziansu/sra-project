@java.lang.Override
public java.lang.Object call(org.mozilla.javascript.Context cx, org.mozilla.javascript.Scriptable scope, org.mozilla.javascript.Scriptable thisObj, java.lang.Object[] args) {
    assert (connection.current()) != null : "cannot call remote functions without a connected client in context";
    connection.current().send(jj.jjmessage.JJMessage.makeCall(java.lang.String.valueOf(args[0]), java.lang.String.valueOf(args[1])));
    return org.mozilla.javascript.Undefined.instance;
}