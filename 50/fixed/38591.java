private void increaseVolume() {
    if ((rearth.networking.ComputerStats.getInstance().Volume) < 1) {
        rearth.networking.ComputerStats.getInstance().Volume += 0.05;
    }
}