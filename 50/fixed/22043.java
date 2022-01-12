void removeDevice(int index) {
    if ((deviceIdx) != (-1))
        devices.remove(index);
    
    update();
    deviceIdx = -1;
}