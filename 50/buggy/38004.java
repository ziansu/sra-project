private pcl.OpenFM.player.PlayBackEvent createEvent(javazoom.jl.player.AudioDevice dev, int id) {
    return new pcl.OpenFM.player.PlayBackEvent(this, id, dev.getPosition());
}