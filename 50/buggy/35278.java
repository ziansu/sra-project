@android.support.annotation.Nullable
@java.lang.Override
public mihaljevic.miroslav.foundry.slimplayer.BrowserRoot onGetRoot(@android.support.annotation.NonNull
java.lang.String clientPackageName, int clientUid, @android.support.annotation.Nullable
android.os.Bundle rootHints) {
    if (mPackageValidator.validate(clientPackageName, clientUid))
        return new mihaljevic.miroslav.foundry.slimplayer.BrowserRoot(mihaljevic.miroslav.foundry.slimplayer.MediaPlayerService.MEDIA_ROOT_ID, rootHints);
    
    return null;
}