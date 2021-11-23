private void lowerVolume() {
    if ((rearth.networking.ComputerStats.getInstance().Volume) > 0.05) {
        rearth.networking.ComputerStats.getInstance().Volume -= 0.05;
    }
}