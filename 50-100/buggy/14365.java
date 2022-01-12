@java.lang.SuppressWarnings(value = "ThrowableResultOfMethodCallIgnored")
public java.lang.String getFailMessage(android.content.Context context, @android.support.annotation.Nullable
java.lang.Exception e) {
    if ((e == null) || (e instanceof java.net.UnknownHostException)) {
        return context.getString((org.nv95.openmanga.providers.staff.MangaProviderManager.checkConnection(context) ? R.string.image_loading_error : R.string.no_network_connection));
    }else
        if (e instanceof org.nv95.openmanga.components.pager.imagecontroller.FileConverter.ConvertException) {
            return context.getString(R.string.image_decode_error);
        }else {
            report("IMGLOAD", e);
            return e.getMessage();
        }
    
}