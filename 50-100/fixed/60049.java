private void setObjectsVelocity(float velocity) {
    for (br.ufpe.cin.dustdog.objects.obstacles.Obstacle obstacle : obstacles) {
        obstacle.velocity.y = -velocity;
    }
    for (br.ufpe.cin.dustdog.objects.garbages.Garbage garbage : garbages) {
        garbage.velocity.x = 0;
        garbage.velocity.y = -velocity;
    }
    for (br.ufpe.cin.dustdog.objects.specialItems.SpecialItem specialItem : specialItems) {
        if (!(specialItem instanceof br.ufpe.cin.dustdog.objects.specialItems.Tornado)) {
            specialItem.velocity.y = -velocity;
        }
    }
}