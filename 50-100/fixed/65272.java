@java.lang.Override
public void update(double deltaTime) {
    smoke[index] = new model.misc.SmokeParticle(car.getX(), car.getY(), rand);
    index = ((index) + 1) % (MAX_SMOKE);
    for (model.misc.SmokeParticle s : smoke) {
        if (s != null)
            s.update(deltaTime);
        
    }
}