private boolean checkMate(Creature other) {
    int score = 0;
    if ((other.sex) != (sex)) {
        score--;
    }
    if ((other.attractiveness) >= ((Creature.random.nextInt(11)) + 5)) {
        score++;
    }
}