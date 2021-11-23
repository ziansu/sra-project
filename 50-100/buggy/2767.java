@java.lang.Override
@hugo.weaving.DebugLog
public void onStreamError(final java.lang.Exception e) {
    pct.droid.base.utils.ThreadUtils.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if (e.getMessage().equals("Write error")) {
                setState(pct.droid.base.fragments.BaseStreamLoadingFragment.State.ERROR, getString(R.string.error_files));
            }else
                if (e.getMessage().equals("Torrent error")) {
                    setState(pct.droid.base.fragments.BaseStreamLoadingFragment.State.ERROR, getString(R.string.torrent_failed));
                }else {
                    setState(pct.droid.base.fragments.BaseStreamLoadingFragment.State.ERROR, getString(R.string.unknown_error));
                }
            
        }
    });
}