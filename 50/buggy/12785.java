public void actionPerformed(java.awt.event.ActionEvent aEvt) {
    org.broad.igv.ui.IGV.getInstance().groupAlignmentTracks(option, null);
    org.broad.igv.sam.AlignmentTrack.refresh();
}