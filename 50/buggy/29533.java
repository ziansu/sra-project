@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> call() throws java.lang.Exception {
    us.kbase.narrativejobservice.subjobs.CallbackServer.cbLog("run");
    return scr.run(rpc);
}