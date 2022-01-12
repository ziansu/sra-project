public void update(float tpf) {
    float fuelCost = tpf * (java.lang.Math.abs(engineActivity));
    float consumedFuel = ship.ConsumeFuel(fuelCost);
    float impulsSize = fuelCost * (java.lang.Math.signum(engineActivity));
    com.jme3.math.Vector3f impuls = engineDirection.mult(impulsSize);
    if (!(impuls.equals(Vector3f.ZERO)))
        ship.physicsController.GiveImpuls(impuls);
    
}