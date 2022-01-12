public static org.mozilla.javascript.Scriptable jsFunction_getAllFiles(org.mozilla.javascript.Context cx, org.mozilla.javascript.Scriptable thisObj, java.lang.Object[] args, org.mozilla.javascript.Function funObj) throws org.jaggeryjs.scriptengine.exceptions.ScriptException {
    java.lang.String functionName = "getAllFiles";
    int argsCount = args.length;
    if (argsCount != 0) {
        org.jaggeryjs.scriptengine.util.HostObjectUtil.invalidNumberOfArgs(org.jaggeryjs.hostobjects.web.RequestHostObject.hostObjectName, functionName, argsCount, false);
    }
    org.jaggeryjs.hostobjects.web.RequestHostObject rho = ((org.jaggeryjs.hostobjects.web.RequestHostObject) (thisObj));
    if (!(rho.isMultipart)) {
        return null;
    }
    org.jaggeryjs.hostobjects.web.RequestHostObject.parseMultipart(rho, thisObj);
    return rho.files;
}