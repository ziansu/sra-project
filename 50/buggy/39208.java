public boolean isValid() {
    synchronized(mSync) {
        return (mSurface) != null ? (mSurface) instanceof android.view.Surface ? ((android.view.Surface) (mSurface)).isValid() : true : false;
    }
}