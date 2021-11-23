public void setDropletParameters() {
    for (int i = 0; i < (droplets.size()); i++) {
        droplets.get(i).x = (((frameSizeX) / (cannonCount)) * (cannonIndex)) + (((frameSizeX) / (cannonCount)) / 2);
        droplets.get(i).y += 5;
    }
}