@java.lang.Override
public boolean invertSegment(org.terasology.rails.tracks.TrackSegment previous, org.terasology.rails.tracks.TrackSegment next) {
    if ((((org.terasology.rails.minecarts.blocks.RailBlockTrackSegment) (previous)).end) == (((org.terasology.rails.minecarts.blocks.RailBlockTrackSegment) (next)).end.reverse()))
        return true;
    
    if ((((org.terasology.rails.minecarts.blocks.RailBlockTrackSegment) (previous)).start) == (((org.terasology.rails.minecarts.blocks.RailBlockTrackSegment) (next)).start.reverse()))
        return true;
    
    return false;
}