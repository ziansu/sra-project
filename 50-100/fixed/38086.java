private org.apache.zeppelin.interpreter.InterpreterResult handleGetInfo(java.util.List<java.lang.String> names) {
    try {
        rapid.api.RapidServiceInfo info = svc.query().getInfo(names).execute().body();
        return io.dashbase.zeppelin.util.DashbaseInterpreterUtil.toInterpretedGetInfo(info);
    } catch (java.lang.Exception e) {
        return io.dashbase.zeppelin.util.DashbaseInterpreterUtil.exception(e);
    }
}