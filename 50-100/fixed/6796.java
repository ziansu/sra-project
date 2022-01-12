public void reset(com.studiau.amazinggravity.Ship ship) {
    float randomFloat = random.nextFloat();
    radius = (com.studiau.amazinggravity.ExhaustParticle.BASE_RADIUS) + (randomFloat * (com.studiau.amazinggravity.ExhaustParticle.MAX_ADDITIONAL_RADIUS));
    locationX = ship.getExhaustLocationX();
    locationY = ship.getExhaustLocationY();
    speedX = (((random.nextFloat()) - 0.5F) * 2) * (com.studiau.amazinggravity.ExhaustParticle.BASE_SPEEDX);
    speedY = (com.studiau.amazinggravity.ExhaustParticle.BASE_SPEEDY) + (randomFloat * (com.studiau.amazinggravity.ExhaustParticle.MAX_ADDITIONAL_SPEEDY));
}