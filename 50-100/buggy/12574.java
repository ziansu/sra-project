public void resume() {
    if ((masterResourceStreamer.getState()) != (DownloadState.STOPPED)) {
        masterResourceStreamer.resume();
    }else {
        masterResourceStreamer.setState(DownloadState.RUNNING, true);
        jacz.peerengineservice.util.datatransfer.master.MasterResourceStreamer newMasterResourceStreamer = new jacz.peerengineservice.util.datatransfer.master.MasterResourceStreamer(masterResourceStreamer, this);
        resourceStreamingManager.activateMasterResourceStreamer(masterResourceStreamer, () -> {
        });
    }
}