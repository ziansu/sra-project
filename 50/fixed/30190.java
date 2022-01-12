public void setPlants(java.util.ArrayList<me.anon.model.Plant> plants) {
    synchronized(this.mPlants) {
        this.mPlants.clear();
        this.mPlants.addAll(plants);
    }
}