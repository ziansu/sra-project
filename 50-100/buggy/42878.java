@java.lang.Override
public boolean invertSegment(org.terasology.rails.tracks.TrackSegment previous, org.terasology.rails.tracks.TrackSegment next) {
    if ((((org.terasology.rails.minecarts.blocks.RailBlockTrackSegment) (previous)).end.reverse()) == (((org.terasology.rails.minecarts.blocks.RailBlockTrackSegment) (next)).start))
        return false;
    
    if ((((org.terasology.rails.minecarts.blocks.RailBlockTrackSegment) (previous)).start.reverse()) == (((org.terasology.rails.minecarts.blocks.RailBlockTrackSegment) (next)).end))
        return false;
    
    return true;
}