@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    com.owncloud.android.lib.common.utils.Log_OC.v(com.owncloud.android.ui.preview.PreviewVideoFragment.TAG, "onSaveInstanceState");
    outState.putParcelable(com.owncloud.android.ui.preview.PreviewVideoFragment.EXTRA_FILE, getFile());
    outState.putParcelable(com.owncloud.android.ui.preview.PreviewVideoFragment.EXTRA_ACCOUNT, mAccount);
    outState.putBoolean(com.owncloud.android.ui.preview.PreviewVideoFragment.EXTRA_AUTOPLAY, mAutoplay);
    outState.putLong(com.owncloud.android.ui.preview.PreviewVideoFragment.EXTRA_PLAY_POSITION, player.getCurrentPosition());
}