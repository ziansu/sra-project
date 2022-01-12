@java.lang.Override
public void onStop() {
    super.onStop();
    dan.dit.whatsthat.image.ImageManager.unregisterSynchronizationListener(this);
    dan.dit.whatsthat.riddle.RiddleManager.unregisterInitProgressListener(this);
    android.util.Log.d("HomeStuff", ((("OnStop of SyncingFragment, init running=" + (dan.dit.whatsthat.riddle.RiddleManager.isInitializing())) + " sync running=") + (dan.dit.whatsthat.image.ImageManager.isSyncing())));
    dan.dit.whatsthat.riddle.RiddleManager.cancelInit();
    mIntroKid.clearAnimation();
    mIntroAbduction.clearAnimation();
}