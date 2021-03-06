@android.support.annotation.Nullable
@java.lang.Override
public T get() {
    if (mBackingPreference.exists()) {
        return mGson.fromJson(mBackingPreference.get(), mType);
    }else {
        return com.garpr.android.preferences.persistent.PersistentGsonPreference.getDefaultValue();
    }
}