private void incrementAge() {
    if (((HumanTemplate.days) % 365) == 0) {
        (age)++;
        deathProbability = (deathProbability) + 0.01;
    }
    if ((age) > (HumanTemplate.MAX_AGE)) {
        setDead();
    }
    if (((age) > (HumanTemplate.NATURALCAUSE_AGE)) && ((HumanTemplate.rand.nextDouble()) <= (deathProbability))) {
        setDead();
    }
}