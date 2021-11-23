public void refreshMusic() {
    org.xbmc.kore.host.HostInfo hostInfo = org.xbmc.kore.host.HostManager.getInstance(getActivity()).getHostInfo();
    if (hostInfo != null) {
        android.content.Intent syncIntent = new android.content.Intent(this.getActivity(), org.xbmc.kore.service.LibrarySyncService.class);
        syncIntent.putExtra(LibrarySyncService.SYNC_ALL_MUSIC, true);
        syncIntent.putExtra(LibrarySyncService.SYNC_ALL_MUSIC_VIDEOS, true);
        getActivity().startService(syncIntent);
        refreshMenuItemAnimator.startAnimation();
    }else {
        android.widget.Toast.makeText(getActivity(), R.string.no_xbmc_configured, Toast.LENGTH_SHORT).show();
    }
}