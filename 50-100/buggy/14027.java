@java.lang.Override
public void onFileSelected(int id, br.com.carlosrafaelgn.fplay.list.FileSt file) {
    if (!(isLayoutCreated()))
        return ;
    
    if (id == (br.com.carlosrafaelgn.fplay.ActivityMain.MNU_LOADLIST)) {
        Player.songs.clear();
        Player.songs.startDeserializingOrImportingFrom(file, true, false, false);
        br.com.carlosrafaelgn.fplay.ui.BackgroundActivityMonitor.start(getHostActivity());
    }else {
        Player.songs.startExportingTo(file);
        br.com.carlosrafaelgn.fplay.ui.BackgroundActivityMonitor.start(getHostActivity());
    }
}