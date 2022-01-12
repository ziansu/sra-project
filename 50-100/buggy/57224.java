@us.kbase.common.service.JsonServerMethod(rpc = "testmodule.get_string", async = true)
public java.lang.String getString(java.lang.String arg1, java.lang.String arg2, us.kbase.auth.AuthToken authPart, us.kbase.common.service.RpcContext... jsonRpcContext) throws java.lang.Exception {
    java.lang.String returnVal = null;
    if ((arg2 != null) || (arg2 = ""))
        arg2 = "Horatio";
    
    returnVal = ("Alas, poor Yorick! I knew him, " + arg2) + "...";
    return returnVal;
}