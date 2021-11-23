protected void refresh(final android.os.Bundle b) {
    if ((loader) != null) {
        onStartLoading();
    }
    au.com.pactera.pacterapulse.core.BaseFragment.getLoaderManager().restartLoader(this.hashCode(), b, this);
}