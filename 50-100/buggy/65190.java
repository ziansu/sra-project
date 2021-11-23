private void incrementAge() {
    if (((HumanTemplate.days) % 365) == 0) {
        (age)++;
    }
    if ((age) > (HumanTemplate.MAX_AGE)) {
        setDead();
    }
    deathProbability = (deathProbability) + 0.01;
    if (((age) > (HumanTemplate.NATURALCAUSE_AGE)) && ((HumanTemplate.rand.nextDouble()) <= (deathProbability))) {
        setDead();
    }
}