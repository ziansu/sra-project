@java.lang.Override
public void onEvent(int event, java.lang.String path) {
    if ((event & (dev.dworks.apps.anexplorer.provider.ExternalStorageProvider.DirectoryObserver.NOTIFY_EVENTS)) != 0) {
        if (dev.dworks.apps.anexplorer.provider.ExternalStorageProvider.LOG_INOTIFY)
            android.util.Log.d(dev.dworks.apps.anexplorer.provider.ExternalStorageProvider.TAG, ((("onEvent() " + event) + " at ") + path));
        
        mResolver.notifyChange(mNotifyUri, null, false);
        mResolver.notifyChange(dev.dworks.apps.anexplorer.model.DocumentsContract.buildRootsUri(dev.dworks.apps.anexplorer.provider.ExternalStorageProvider.AUTHORITY), null, false);
    }
}