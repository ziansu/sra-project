public void actionPerformed(java.awt.event.ActionEvent aEvt) {
    java.lang.String tag = org.broad.igv.ui.util.MessageUtils.showInputDialog("Enter tag", renderOptions.getGroupByTag());
    if ((tag != null) && ((tag.trim().length()) > 0)) {
        renderOptions.setGroupByTag(tag);
        org.broad.igv.ui.IGV.getInstance().groupAlignmentTracks(org.broad.igv.sam.AlignmentTrack.GroupOption.TAG, tag);
        org.broad.igv.sam.AlignmentTrack.refresh();
    }
}