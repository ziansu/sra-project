@java.lang.Override
public void createHaver(@android.support.annotation.NonNull
long desireId, @android.support.annotation.NonNull
de.fau.cs.mad.wanthavers.common.Haver haver, @android.support.annotation.NonNull
wanthavers.mad.cs.fau.de.wanthavers_android.data.source.haver.CreateHaverCallback callback) {
    try {
        de.fau.cs.mad.wanthavers.common.Haver ret = haverEndpoint.createHaver(desireId, haver, null);
        callback.onHaverCreated(ret);
    } catch (java.lang.Throwable t) {
        callback.onCreateFailed();
    }
}