public void initialize(com.badlogic.gdx.math.Vector2 position, com.badlogic.gdx.math.Vector2 direction) {
    objectType = defaultProperties.get(com.mygdx.ouyagame.objects.OBJECT_TYPE, com.mygdx.ouyagame.objects.BaseObject.ObjectTypeEnum.class);
    textureInitialRotation = defaultProperties.get(com.mygdx.ouyagame.objects.TEXTURE_INITIAL_ROTATION, java.lang.Float.class);
    this.addActor(statusEffectHandler);
    float maxHealth = defaultProperties.get(com.mygdx.ouyagame.objects.MAX_HEALTH, java.lang.Float.class);
    healthStat = new com.mygdx.ouyagame.misc.RestrictedStat(maxHealth, 0.0F, maxHealth);
    setupGfx();
    setupPhysics(position);
    setDirection(direction);
    setTeam(Team.ALL);
}