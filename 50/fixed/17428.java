@java.lang.Override
public int getSelectedArtistId() {
    if ((pager) != null)
        return adapter.getArtist(pager.getCurrentItem()).getId();
    else
        return -1;
    
}