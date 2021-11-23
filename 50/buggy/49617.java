public void simInit(Buffer b) {
    for (int i = 0; i < (b.getLength()); i++)
        b.add(this.updateSim());
    
}