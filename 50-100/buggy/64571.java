@java.lang.Override
public void onLoadComplete(android.media.SoundPool soundPool, int soundId, int status) {
    int resourceId = toResourceId(soundId);
    jp.techblog.epsiloncode.soundpoolwrapper.SoundPoolWrapper.OnLoadCompleteCallback callback = mResourceIdToCallbackMap.get(resourceId);
    if (callback != null) {
        callback.onLoadComplete((status == 0));
        mResourceIdToCallbackMap.remove(resourceId);
    }
    mLoadedResourceIds.add(resourceId);
}