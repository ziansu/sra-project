private void initTracks() {
    tracks = new java.util.ArrayList<Track>();
    boolean alreadyExist;
    for (TrainStation station1 : Control.stations) {
        for (TrainStation station2 : Control.stations) {
            alreadyExist = false;
            for (Track track : tracks) {
                if (track.compareTrack(station1, station2))
                    alreadyExist = true;
                
            }
            if (!alreadyExist)
                tracks.add(new Track(station1, station2));
            
        }
    }
}