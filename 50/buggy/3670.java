private void incrementAge() {
    (age)++;
    if ((age) > (Grass.MAX_AGE)) {
        setDead(Grass.STATIC_ACTOR);
    }
}