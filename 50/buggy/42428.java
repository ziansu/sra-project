@android.support.annotation.Nullable
public com.charlesmadere.hummingbird.models.LibraryUpdate getLibraryUpdate() {
    if (mLibraryUpdate.containsModifications(mLibraryEntry)) {
        return mLibraryUpdate;
    }else {
        return null;
    }
}