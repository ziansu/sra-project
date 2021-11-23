protected void refresh(final android.os.Bundle b) {
    au.com.pactera.pacterapulse.core.BaseFragment.getLoaderManager().restartLoader(this.hashCode(), b, this);
}