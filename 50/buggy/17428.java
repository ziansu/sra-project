@java.lang.Override
public int getSelectedArtistId() {
    return adapter.getArtist(pager.getCurrentItem()).getId();
}