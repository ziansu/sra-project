private int[] obtainVersionAndRevision() {
    int[] position;
    if (type.equals(de.axxepta.oxygen.versioncontrol.VersionRevisionUpdater.XML))
        position = getXMLHistoryTagPosition();
    else
        position = getQueryHistoryTagPosition();
    
    if ((position[0]) != (position[1]))
        extractVersionAndRevision(position);
    
    return position;
}