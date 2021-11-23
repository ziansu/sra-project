public void setWorking(boolean isWorking) {
    this.isWorking = isWorking;
    carWash.setEndOfDay();
    for (Pump p : fuelPumps)
        p.shutDown();
    
}