@java.lang.Override
public void handleCustomException(java.lang.String message, java.lang.Throwable thrown, @javax.annotation.Nullable
org.auraframework.util.json.JsonSerializable data) {
    final java.lang.String errorId = processError(message, thrown);
    final org.auraframework.throwable.GenericEventException gee = new org.auraframework.throwable.GenericEventException(org.auraframework.impl.adapter.ServerErrorUtilAdapterImpl.EVENTNAME, thrown);
    final org.auraframework.throwable.ClientSideError error = new org.auraframework.throwable.ClientSideError(message, org.auraframework.throwable.AuraExceptionUtil.getStackTrace(thrown), data, errorId);
    gee.addParam("error", error);
    throw gee;
}