public float getLifeCyclePercent() {
    float life = ((float) ((engine.GlobalData.time) - (spawnTime))) / ((float) (lifeTime));
    if (life >= 1)
        remove();
    
    return java.lang.Math.min(life, 1.0F);
}