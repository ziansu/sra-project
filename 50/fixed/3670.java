private void incrementAge() {
    (age)++;
    if ((age) > (Grass.MAX_AGE)) {
        this.setDead(Grass.STATIC_ACTOR);
    }
}