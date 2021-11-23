@java.lang.Override
public void onError(org.liquidplayer.service.MicroService service, java.lang.Exception e) {
    android.util.Log.e(com.phonemap.phonemap.services.JSRunner.LOG_TAG, "Error occurred within MicroService");
    android.os.Bundle bundle = new android.os.Bundle();
    java.io.StringWriter sw = new java.io.StringWriter();
    e.printStackTrace(new java.io.PrintWriter(sw));
    bundle.putString(com.phonemap.phonemap.constants.Sockets.EXCEPTION, sw.toString());
    messengerSender.setMessage(com.phonemap.phonemap.constants.Sockets.FAILED_EXECUTING_CODE).setData(bundle).send();
    getDataAndCode();
}