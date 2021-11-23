@java.lang.Override
public void onSuccess(@android.support.annotation.NonNull
java.util.List<T> data) {
    mDataCache.clear();
    mDataCache.addAll(data);
    callback.onSuccess(mDataCache);
}