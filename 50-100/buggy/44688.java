@java.lang.Override
public void onResult(com.google.android.gms.common.api.Status status) {
    org.appcelerator.kroll.common.Log.d(ti.googlesignin.GooglesigninModule.LCAT, "oResult SignOut");
    org.appcelerator.kroll.KrollDict kd = new org.appcelerator.kroll.KrollDict();
    kd.put("status", status.getStatusCode());
    kd.put("status1", status.toString());
    if (hasListeners("onsignout")) {
        org.appcelerator.kroll.common.Log.e(ti.googlesignin.GooglesigninModule.LCAT, "The 'onsignout' event is deprecated, use 'disconnect' instead.");
        fireEvent("onsignout", kd);
    }
    if (hasListeners("disconnect")) {
        fireEvent("disconnect", kd);
    }
}