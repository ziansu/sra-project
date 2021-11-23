public modelrailway.simulation.Track getBack() {
    if ((track[1]) == null)
        return getFront();
    
    return track[1];
}