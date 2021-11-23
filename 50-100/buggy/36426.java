@java.lang.Override
public void updateHaverStatus(@android.support.annotation.NonNull
long desireId, @android.support.annotation.NonNull
long userId, @android.support.annotation.NonNull
de.fau.cs.mad.wanthavers.common.Haver haver, @android.support.annotation.NonNull
int status, @android.support.annotation.NonNull
wanthavers.mad.cs.fau.de.wanthavers_android.data.source.haver.UpdateHaverStatusCallback callback) {
    try {
        de.fau.cs.mad.wanthavers.common.Haver ret = haverClient.setHaverStatus(desireId, userId, haver, status);
        callback.onStatusUpdated(ret);
    } catch (java.lang.Throwable t) {
        callback.onUpdateFailed();
    }
}