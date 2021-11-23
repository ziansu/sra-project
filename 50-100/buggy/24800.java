@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    models.Track track = ((models.Track) (o));
    if ((epicodusId) != (track.epicodusId))
        return false;
    
    if (!(trackName.equals(track.trackName)))
        return false;
    
    return trackDetails.equals(track.trackDetails);
}