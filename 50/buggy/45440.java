public void subtractScore(int score) {
    this.score -= score;
    com.github.TheDwoon.robots.game.entity.Robot.log.info("robot #{} has a new score of {} point{}", getUUID(), score, ((java.lang.Math.abs(score)) == 1 ? "" : 's'));
}