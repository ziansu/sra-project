@android.support.annotation.Nullable
@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    return new ch.dissem.apps.abit.service.ProofOfWorkService.PowBinder(this);
}